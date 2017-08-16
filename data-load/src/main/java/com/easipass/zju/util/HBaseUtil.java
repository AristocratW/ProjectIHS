package com.easipass.zju.util;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.Admin;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.ConnectionFactory;
import org.apache.hadoop.hbase.client.Table;

import java.io.IOException;

/**
 * Created by Wangxuyang on 2017/8/9.
 */

public class HBaseUtil {
    public static Configuration configuration;
    public static Connection connection;
    static {
        configuration = HBaseConfiguration.create();
        configuration.set("hbase.zookeeper.property.clientPort", "2181");
        configuration.set("hbase.zookeeper.quorum", "192.168.130.141,192.168.130.142,192.168.130.143");
        configuration.set("hbase.master", "192.168.130.141:16000");
        configuration.setInt("hbase.client.operation.timeout", 60000);
        configuration.setInt("hbase.client.retries.number", 10);
    }

    public static Configuration getConfiguration() {
        return configuration;
    }

    public static synchronized Connection getConnection() {
        if(null == connection){
            try {
                connection = ConnectionFactory.createConnection(getConfiguration());
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Connecting HBase Error");
            }
        }
        return connection;
    }

    public static void createTable(HTableDescriptor descriptor) throws IOException {
        Admin admin = getConnection().getAdmin();
        if(!admin.tableExists(descriptor.getTableName())){
            admin.createTable(descriptor);
        }
    }

    public static void deleteTable(String tableName) throws IOException {
        Admin admin = getConnection().getAdmin();
        if(admin.tableExists(TableName.valueOf(tableName))){
            admin.disableTable(TableName.valueOf(tableName));
            admin.deleteTable(TableName.valueOf(tableName));
        }
    }

    public static void listTable() throws IOException {
        Admin admin = getConnection().getAdmin();
        TableName[] tableNames= admin.listTableNames();
        System.out.println(tableNames.length);
        for (TableName tn: tableNames) {
            System.out.println("Table: "+tn.getNameAsString());
        }
    }

    public static Table getTableByName(String name) throws IOException {
           return connection.getTable(TableName.valueOf(name));
    }

    public static void main(String[] args) throws IOException {
        listTable();
    }
}
