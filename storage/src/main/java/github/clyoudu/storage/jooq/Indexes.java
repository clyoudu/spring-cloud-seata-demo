/*
 * This file is generated by jOOQ.
 */
package github.clyoudu.storage.jooq;


import github.clyoudu.storage.jooq.tables.StockTb;

import javax.annotation.Generated;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables of the <code>stock_db</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index STOCK_TB_ID = Indexes0.STOCK_TB_ID;
    public static final Index STOCK_TB_PRIMARY = Indexes0.STOCK_TB_PRIMARY;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index STOCK_TB_ID = Internal.createIndex("id", StockTb.STOCK_TB, new OrderField[] { StockTb.STOCK_TB.ID, StockTb.STOCK_TB.USER_NAME }, true);
        public static Index STOCK_TB_PRIMARY = Internal.createIndex("PRIMARY", StockTb.STOCK_TB, new OrderField[] { StockTb.STOCK_TB.ID }, true);
    }
}
