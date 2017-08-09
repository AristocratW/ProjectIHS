package com.easipass.zju.xmlParse;



import org.xml.sax.helpers.DefaultHandler;

import java.util.List;

/**
 * Created by ssw on 17-8-1.
 */
public abstract class Resolver extends DefaultHandler {
    public abstract List getList();
}
