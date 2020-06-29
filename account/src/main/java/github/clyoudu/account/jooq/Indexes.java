/*
 * This file is generated by jOOQ.
 */
package github.clyoudu.account.jooq;


import github.clyoudu.account.jooq.tables.BalanceTb;

import javax.annotation.Generated;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables of the <code>balance_db</code> schema.
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

    public static final Index BALANCE_TB_PRIMARY = Indexes0.BALANCE_TB_PRIMARY;
    public static final Index BALANCE_TB_USER_NAME = Indexes0.BALANCE_TB_USER_NAME;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index BALANCE_TB_PRIMARY = Internal.createIndex("PRIMARY", BalanceTb.BALANCE_TB, new OrderField[] { BalanceTb.BALANCE_TB.ID }, true);
        public static Index BALANCE_TB_USER_NAME = Internal.createIndex("user_name", BalanceTb.BALANCE_TB, new OrderField[] { BalanceTb.BALANCE_TB.USER_NAME }, true);
    }
}
