package com.easipass.zju.xmlParse;

/**
 * Created by ssw on 17-8-1.
 */
public class ResolverFactory {
    public static Resolver getResolver(String type){
        Resolver resolver = null;
        if("CombinedPositionsData".equals(type)){
            resolver = new CombinedPositionsDataResolver();
        }else if("MovementData".equals(type)){
            resolver = new MovementDataResolver();
        }else if("tblPortTerminal".equals(type)){
            resolver = new TblPortTerminalResolver();
        }else if("tblPortBerth".equals(type)){
            resolver = new TblPortBerthResolver();
        }else if("PortsData".equals(type)){
            resolver = new PortsDataResolver();
        }else if("ShipData".equals(type)){
            resolver = new ShipDataResolver();
        }
        return resolver;
    }
}
