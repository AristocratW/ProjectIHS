package com.easipass.zju.hbase;

import com.easipass.zju.model.CombinedPositionsData;
import com.easipass.zju.util.HBaseUtil;
import org.apache.hadoop.hbase.HColumnDescriptor;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.Get;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.client.Table;
import org.apache.hadoop.hbase.util.Bytes;

import java.io.IOException;
import java.util.List;

/**
 * Created by Wangxuyang on 2017/8/11.
 */
public class PersistCombinedPositionsData {
    private Table table;
    public PersistCombinedPositionsData() throws IOException {
        this.table = HBaseUtil.getTableByName("CombinedPositionsData");
    }

    public void createTable(){
        if(table==null){
            HTableDescriptor descriptor = new HTableDescriptor(TableName.valueOf("CombinedPositionsData"));
            descriptor.addFamily(new HColumnDescriptor("cf"));
            try {
                HBaseUtil.createTable(descriptor);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void put(List<CombinedPositionsData> dataList){
        for (CombinedPositionsData c:dataList) {
            Put p = new Put(Bytes.toBytes(c.getLRIMOShipNo()));
            p.addColumn(Bytes.toBytes("cf"),Bytes.toBytes("ShipName"),Bytes.toBytes(c.getShipName()));
            p.addColumn(Bytes.toBytes("cf"),Bytes.toBytes("ShipType"),Bytes.toBytes(c.getShipType()));
            p.addColumn(Bytes.toBytes("cf"),Bytes.toBytes("MovementDateTime"),Bytes.toBytes(c.getMovementDateTime()));
            p.addColumn(Bytes.toBytes("cf"),Bytes.toBytes("MovementID"),Bytes.toBytes(c.getMovementID()));
            p.addColumn(Bytes.toBytes("cf"),Bytes.toBytes("CallSign"),Bytes.toBytes(c.getCallSign()));
            p.addColumn(Bytes.toBytes("cf"),Bytes.toBytes("MMSI"),Bytes.toBytes(c.getMMSI()));
            p.addColumn(Bytes.toBytes("cf"),Bytes.toBytes("Destination"),Bytes.toBytes(c.getDestination()));
            p.addColumn(Bytes.toBytes("cf"),Bytes.toBytes("DestinationTidied"),Bytes.toBytes(c.getDestinationTidied()));
            p.addColumn(Bytes.toBytes("cf"),Bytes.toBytes("ETA"),Bytes.toBytes(c.getETA()));
            p.addColumn(Bytes.toBytes("cf"),Bytes.toBytes("Speed"),Bytes.toBytes(c.getSpeed()));
            p.addColumn(Bytes.toBytes("cf"),Bytes.toBytes("Heading"),Bytes.toBytes(c.getHeading()));
            p.addColumn(Bytes.toBytes("cf"),Bytes.toBytes("Latitude"),Bytes.toBytes(c.getLatitude()));
            p.addColumn(Bytes.toBytes("cf"),Bytes.toBytes("Longitude"),Bytes.toBytes(c.getLongitude()));
            p.addColumn(Bytes.toBytes("cf"),Bytes.toBytes("Length"),Bytes.toBytes(c.getLength()));
            p.addColumn(Bytes.toBytes("cf"),Bytes.toBytes("Draught"),Bytes.toBytes(c.getDraught()));
            p.addColumn(Bytes.toBytes("cf"),Bytes.toBytes("Beam"),Bytes.toBytes(c.getBeam()));
            p.addColumn(Bytes.toBytes("cf"),Bytes.toBytes("TEU"),Bytes.toBytes(c.getTEU()));
            p.addColumn(Bytes.toBytes("cf"),Bytes.toBytes("MoveStatus"),Bytes.toBytes(c.getMoveStatus()));
            p.addColumn(Bytes.toBytes("cf"),Bytes.toBytes("AdditionalInfo"),Bytes.toBytes(c.getAdditionalInfo()));
        }
    }

    public void get(String rowKey, String columnFamily, String column){
        Get get = new Get(Bytes.toBytes(rowKey));
        Result result = null;
        try {
            result = table.get(get);
        } catch (IOException e) {
            e.printStackTrace();
        }
        byte[] value = result.getValue(Bytes.toBytes(columnFamily),Bytes.toBytes(column));
        System.out.println("Value: "+ Bytes.toString(value));
    }

    public static void main(String[] args) throws IOException {
        PersistCombinedPositionsData per = new PersistCombinedPositionsData();
        per.createTable();
    }
}
