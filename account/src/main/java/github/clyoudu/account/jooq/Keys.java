/*
 * This file is generated by jOOQ.
 */
package github.clyoudu.account.jooq;


import github.clyoudu.account.jooq.tables.BalanceTb;
import github.clyoudu.account.jooq.tables.records.BalanceTbRecord;

import javax.annotation.Generated;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>balance_db</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<BalanceTbRecord, Integer> IDENTITY_BALANCE_TB = Identities0.IDENTITY_BALANCE_TB;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<BalanceTbRecord> KEY_BALANCE_TB_PRIMARY = UniqueKeys0.KEY_BALANCE_TB_PRIMARY;
    public static final UniqueKey<BalanceTbRecord> KEY_BALANCE_TB_USER_NAME = UniqueKeys0.KEY_BALANCE_TB_USER_NAME;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<BalanceTbRecord, Integer> IDENTITY_BALANCE_TB = Internal.createIdentity(BalanceTb.BALANCE_TB, BalanceTb.BALANCE_TB.ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<BalanceTbRecord> KEY_BALANCE_TB_PRIMARY = Internal.createUniqueKey(BalanceTb.BALANCE_TB, "KEY_balance_tb_PRIMARY", BalanceTb.BALANCE_TB.ID);
        public static final UniqueKey<BalanceTbRecord> KEY_BALANCE_TB_USER_NAME = Internal.createUniqueKey(BalanceTb.BALANCE_TB, "KEY_balance_tb_user_name", BalanceTb.BALANCE_TB.USER_NAME);
    }
}