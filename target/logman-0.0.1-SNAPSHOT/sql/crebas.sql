/*==============================================================*/
/* Database name:  logman                                       */
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2015/1/28 0:26:44                            */
/*==============================================================*/


DROP DATABASE IF EXISTS LOGMAN;

/*==============================================================*/
/* Database: LOGMAN                                             */
/*==============================================================*/
CREATE DATABASE LOGMAN;

USE LOGMAN;

/*==============================================================*/
/* Table: ABSENCE                                               */
/*==============================================================*/
CREATE TABLE ABSENCE
(
   ABSENCE_ID           INT NOT NULL AUTO_INCREMENT,
   DATE                 DATE,
   NAME                 VARCHAR(10),
   TYPE                 VARCHAR(30),
   DURATION             FLOAT,
   DEDUCTED_AMOUNT      DOUBLE,
   OPERATOR             VARCHAR(10),
   REMARK               VARCHAR(50),
   PRIMARY KEY (ABSENCE_ID)
);

/*==============================================================*/
/* Table: ABSENCETYPE                                           */
/*==============================================================*/
CREATE TABLE ABSENCETYPE
(
   ABSENCETYPE_ID       INT NOT NULL AUTO_INCREMENT,
   ABSENCETYPE_NAME     VARCHAR(14),
   DEDUCTION            INT,
   PRIMARY KEY (ABSENCETYPE_ID)
);

/*==============================================================*/
/* Table: ACCIDENT                                              */
/*==============================================================*/
CREATE TABLE ACCIDENT
(
   ACCIDENT_ID          INT NOT NULL AUTO_INCREMENT,
   VEHICLE              VARCHAR(30),
   DRIVER               VARCHAR(30),
   ACCIDENT_DATE        DATE,
   LOCATION             VARCHAR(50),
   RESPONSIBLE_PARTY    VARCHAR(40),
   OPERATOR             VARCHAR(14),
   REMARK               VARCHAR(50),
   PRIMARY KEY (ACCIDENT_ID)
);

/*==============================================================*/
/* Table: ACCOUNT                                               */
/*==============================================================*/
CREATE TABLE ACCOUNT
(
   ACCOUNT_ID           INT NOT NULL AUTO_INCREMENT,
   NAME                 VARCHAR(14),
   TYPE                 VARCHAR(14),
   BANK                 VARCHAR(14),
   ACCOUNT              VARCHAR(20),
   INIT_AMOUNT          DOUBLE,
   REMARK               VARCHAR(50),
   PRIMARY KEY (ACCOUNT_ID)
);

/*==============================================================*/
/* Table: ADDOIL_NEEDTOPAYSETTLE                                */
/*==============================================================*/
CREATE TABLE ADDOIL_NEEDTOPAYSETTLE
(
   SETTLE_ID            INT NOT NULL AUTO_INCREMENT,
   SETTLE_DATE          DATE,
   OIL_STATION          VARCHAR(30),
   PREPAY_REMAINDER     DOUBLE,
   NEEDTOPAY            DOUBLE,
   PREPAY               DOUBLE,
   ACTUAL_PAY           DOUBLE,
   ACCOUNT              VARCHAR(30),
   OPERATOR             VARCHAR(14),
   REMARK               VARCHAR(50),
   PRIMARY KEY (SETTLE_ID)
);

/*==============================================================*/
/* Table: ADDOIL_PAY_DETAIL                                     */
/*==============================================================*/
CREATE TABLE ADDOIL_PAY_DETAIL
(
   MXID                 INT NOT NULL AUTO_INCREMENT,
   SETTLE_ID            INT,
   DANJU_NO             VARCHAR(30),
   NEEDTOPAY            DOUBLE,
   ALREADY_PAY          DOUBLE,
   NOTHAS_PAY           DOUBLE,
   THIS_PAY             DOUBLE,
   ISPAY                VARCHAR(6),
   PRIMARY KEY (MXID)
);

/*==============================================================*/
/* Table: BANKDEPOSIT                                           */
/*==============================================================*/
CREATE TABLE BANKDEPOSIT
(
   DEPSIT_ID            INT NOT NULL AUTO_INCREMENT,
   DEPOSIT_NO           VARCHAR(40),
   DATE                 DATE,
   PAYACCOUNT           VARCHAR(30),
   RECEIVE              VARCHAR(30),
   AMOUNT               DOUBLE,
   CHECK_NUMBER         VARCHAR(30),
   OPERATOR             VARCHAR(14),
   RERMARK              VARCHAR(50),
   PRIMARY KEY (DEPSIT_ID)
);

/*==============================================================*/
/* Table: BORROW_PURPOSE                                        */
/*==============================================================*/
CREATE TABLE BORROW_PURPOSE
(
   PURPOSE_ID           INT NOT NULL AUTO_INCREMENT,
   PURPOSE              VARCHAR(20),
   PRIMARY KEY (PURPOSE_ID)
);

/*==============================================================*/
/* Table: BORROW_RETURN                                         */
/*==============================================================*/
CREATE TABLE BORROW_RETURN
(
   RECORD_ID            INT NOT NULL AUTO_INCREMENT,
   DATE                 DATE,
   TYPE                 VARCHAR(30),
   NAME                 VARCHAR(30),
   USE_PURPOSE          VARCHAR(30),
   AMOUNT               DOUBLE,
   ACCOUNT              VARCHAR(30),
   REBACK               VARCHAR(30),
   ISFINISHED           VARCHAR(30),
   OPERATOR             VARCHAR(14),
   REMARK               VARCHAR(50),
   PRIMARY KEY (RECORD_ID)
);

/*==============================================================*/
/* Table: CARD_REFUEL                                           */
/*==============================================================*/
CREATE TABLE CARD_REFUEL
(
   CARD_REFUEL_ID       INT NOT NULL AUTO_INCREMENT,
   REFUEL_DATE          DATE,
   VEHICLE              VARCHAR(30),
   DRIVER               VARCHAR(30),
   OILCARD              VARCHAR(30),
   OILTYPE              VARCHAR(30),
   UNIT_PRICE           DOUBLE,
   AMOUNT               DOUBLE,
   WEIGNT               DOUBLE,
   OPERATOR             VARCHAR(14),
   REMARK               VARCHAR(50),
   PRIMARY KEY (CARD_REFUEL_ID)
);

/*==============================================================*/
/* Table: CASH_REFUEL                                           */
/*==============================================================*/
CREATE TABLE CASH_REFUEL
(
   CASHREFUEL_ID        INT NOT NULL AUTO_INCREMENT,
   REFUEL_DATE          DATE,
   VEHICLE              VARCHAR(30),
   DRIVER               VARCHAR(30),
   OIL_TYPE             VARCHAR(30),
   UNIT_PRICE           DOUBLE,
   AMOUNT               DOUBLE,
   WEIGHT               DOUBLE,
   ACCOUNT              VARCHAR(30),
   OPERATOR             VARCHAR(14),
   REMARK               VARCHAR(50),
   PRIMARY KEY (CASHREFUEL_ID)
);

/*==============================================================*/
/* Table: COSTUMER                                              */
/*==============================================================*/
CREATE TABLE COSTUMER
(
   COSUMER_ID           INT NOT NULL AUTO_INCREMENT,
   COSTUMER_ABBR        VARCHAR(14),
   TYPE                 VARCHAR(14),
   FULL_NAME            VARCHAR(50),
   CLASSIFICATION       VARCHAR(14),
   CODE                 VARCHAR(14),
   CONTACT              VARCHAR(14),
   TEL                  VARCHAR(14),
   PHONE                VARCHAR(14),
   FAX_NUMBER           VARCHAR(14),
   ADDR                 VARCHAR(50),
   TAX_NUMBER           VARCHAR(25),
   BANK                 VARCHAR(20),
   BANK_ACCOUNT         VARCHAR(20),
   REMARK               VARCHAR(50),
   PRIMARY KEY (COSUMER_ID)
);

/*==============================================================*/
/* Table: DEPARTMENT                                            */
/*==============================================================*/
CREATE TABLE DEPARTMENT
(
   DEPARTMENT_ID        INT NOT NULL AUTO_INCREMENT,
   DEPARTMENT_NAME      VARCHAR(20),
   REMARK               VARCHAR(50),
   PRIMARY KEY (DEPARTMENT_ID)
);

/*==============================================================*/
/* Table: DISPATCH                                              */
/*==============================================================*/
CREATE TABLE DISPATCH
(
   DISPATCH_ID          INT NOT NULL AUTO_INCREMENT,
   CHUCHE_DATE          DATE,
   HUICHANG_DATE        DATE,
   FLEET                VARCHAR(30),
   VEHICLE              VARCHAR(30),
   GUACHE               VARCHAR(30),
   DRIVER               VARCHAR(30),
   ZHUANGXIEYUAN        VARCHAR(14),
   REMARK               VARCHAR(50),
   PRIMARY KEY (DISPATCH_ID)
);

/*==============================================================*/
/* Table: DISPATCH_DETAIL                                       */
/*==============================================================*/
CREATE TABLE DISPATCH_DETAIL
(
   DETAIL_ID            INT NOT NULL AUTO_INCREMENT,
   DISPATCH_ID          INT,
   ORDER_ID             INT,
   DELIVERY_DATE        DATE,
   ISWHOLE              VARCHAR(6),
   DISPATCH_AMOUNT      DOUBLE,
   ACTUAL_AMOUNT        DOUBLE,
   REMARK               VARCHAR(50),
   PRIMARY KEY (DETAIL_ID)
);

/*==============================================================*/
/* Table: DRAWOUT                                               */
/*==============================================================*/
CREATE TABLE DRAWOUT
(
   DRAWOUT_ID           INT NOT NULL AUTO_INCREMENT,
   DISPATCH_ID          INT,
   HAVE                 VARCHAR(6),
   FLEET                VARCHAR(30),
   VEHICLE              VARCHAR(30),
   GUACHE               VARCHAR(30),
   DRIVER               VARCHAR(30),
   DATE                 DATE,
   PREPAY               DOUBLE,
   DRAW_MAN             VARCHAR(30),
   REMARK               VARCHAR(50),
   PRIMARY KEY (DRAWOUT_ID)
);

/*==============================================================*/
/* Table: DRAWOUTFEE_TYPE                                       */
/*==============================================================*/
CREATE TABLE DRAWOUTFEE_TYPE
(
   TYPE_ID              INT NOT NULL AUTO_INCREMENT,
   TYPE_NAME            VARCHAR(20),
   ISCASH               VARCHAR(6),
   PRIMARY KEY (TYPE_ID)
);

/*==============================================================*/
/* Table: DRIVER                                                */
/*==============================================================*/
CREATE TABLE DRIVER
(
   DRIVER_ID            INT NOT NULL AUTO_INCREMENT,
   NAME                 VARCHAR(10),
   MNEMONIC             VARCHAR(10),
   VEHICLE              VARCHAR(30),
   DEPARTMENT           VARCHAR(30),
   IDCARD               VARCHAR(20),
   BIRTH                DATE,
   TEL                  VARCHAR(11),
   ADDR                 VARCHAR(50),
   JOINTIME             DATE,
   DRI_LIC_DAT          DATE,
   EXTEND_DATE          DATE,
   DRIVING_LICENSE      VARCHAR(20),
   DRIVING_PERMIT_NO    VARCHAR(20),
   LICENSE_NUMBER       VARCHAR(20),
   SKILL_LEVEL          VARCHAR(10),
   DRIVING_TYPE         VARCHAR(10),
   ISLEAVE              VARCHAR(4),
   RAMARK               VARCHAR(25),
   PRIMARY KEY (DRIVER_ID)
);

ALTER TABLE DRIVER COMMENT '司机表';

/*==============================================================*/
/* Table: ENTERPRISE                                            */
/*==============================================================*/
CREATE TABLE ENTERPRISE
(
   ENTERPRISE_NAME      VARCHAR(20) NOT NULL,
   INSTITUTION_CODE     VARCHAR(10),
   CORPORATE_REPRESENTATIVE VARCHAR(10),
   BANK_OF_DEPOSIT      VARCHAR(20),
   BANK_ACCOUNT         VARCHAR(20),
   TAX_ACCOUNT          VARCHAR(20),
   MAILING_ADDRESS      VARCHAR(50),
   POSTAL_CODE          VARCHAR(6),
   CONTACT_NUMBER       VARCHAR(11),
   PRIMARY KEY (ENTERPRISE_NAME)
);

ALTER TABLE ENTERPRISE COMMENT '企业表';

/*==============================================================*/
/* Table: FITTING_NEEDTOPAY_DETAIL                              */
/*==============================================================*/
CREATE TABLE FITTING_NEEDTOPAY_DETAIL
(
   MXID                 INT NOT NULL AUTO_INCREMENT,
   SETTLE_ID            INT,
   PURCHASE_ID          VARCHAR(30),
   NEEDTOPAY            DOUBLE,
   ALDEAYPAY            DOUBLE,
   NOTHAS_PAY           DOUBLE,
   THIS_PAY             DOUBLE,
   ISPAY                VARCHAR(6),
   PRIMARY KEY (MXID)
);

/*==============================================================*/
/* Table: FITTING_NEEDTOPAY_SETTLE                              */
/*==============================================================*/
CREATE TABLE FITTING_NEEDTOPAY_SETTLE
(
   SETTLE_ID            INT NOT NULL AUTO_INCREMENT,
   SETTLE_DATE          DATE,
   SUPPLIER             VARCHAR(30),
   PREPAY_REMAINDER     DOUBLE,
   NEEDTOPAY            DOUBLE,
   PREPAY               DOUBLE,
   ACTUAL_PAY           DOUBLE,
   ACCOUNT              VARCHAR(30),
   OPERATOR             VARCHAR(14),
   REMARK               VARCHAR(50),
   PRIMARY KEY (SETTLE_ID)
);

/*==============================================================*/
/* Table: FITTING_PURCHASE                                      */
/*==============================================================*/
CREATE TABLE FITTING_PURCHASE
(
   PURCHASE_ID          INT NOT NULL AUTO_INCREMENT,
   DATE                 DATE,
   SUPPLIER             VARCHAR(30),
   BUYER                VARCHAR(14),
   AMOUNT_NEED          DOUBLE,
   CASHPAY              DOUBLE,
   ACCOUNT              VARCHAR(30),
   REMARK               VARCHAR(50),
   PRIMARY KEY (PURCHASE_ID)
);

/*==============================================================*/
/* Table: FITTING_STOCK                                         */
/*==============================================================*/
CREATE TABLE FITTING_STOCK
(
   STOCK_ID             INT NOT NULL AUTO_INCREMENT,
   FITTING_NO           VARCHAR(30) NOT NULL,
   NAME                 VARCHAR(30),
   STANDARD             VARCHAR(20),
   CLASSIFICATION       VARCHAR(20),
   QUANTITY             DOUBLE,
   PRIMARY KEY (STOCK_ID)
);

/*==============================================================*/
/* Table: FITTINGDETAIL                                         */
/*==============================================================*/
CREATE TABLE FITTINGDETAIL
(
   FITTING_ID           INT NOT NULL AUTO_INCREMENT,
   FITTINGNAME          VARCHAR(30),
   UNIT                 VARCHAR(14),
   STANDARD             VARCHAR(30),
   CLASSIFICATION       VARCHAR(30),
   IN_PRICE             DOUBLE,
   STORE_PRICE          DOUBLE,
   INIT_AMOUNT          DOUBLE,
   CURRENT_AMOUNT       DOUBLE,
   MNEMONIC             VARCHAR(14),
   PRIMARY KEY (FITTING_ID)
);

/*==============================================================*/
/* Table: FITTINGPURCHASE_DETAIL                                */
/*==============================================================*/
CREATE TABLE FITTINGPURCHASE_DETAIL
(
   DETAIL_ID            INT NOT NULL AUTO_INCREMENT,
   PURCHASE_ID          INT,
   FITTING_NO           VARCHAR(30),
   FITTING_NAME         VARCHAR(30),
   STANDARD             VARCHAR(20),
   QUANTITY             DOUBLE,
   UNIT_PRICE           DOUBLE,
   AMOUNT               DOUBLE,
   PRIMARY KEY (DETAIL_ID)
);

/*==============================================================*/
/* Table: FIXPOINT_REFUELING                                    */
/*==============================================================*/
CREATE TABLE FIXPOINT_REFUELING
(
   REFUELING_ID         INT NOT NULL AUTO_INCREMENT,
   REFUELING_DATE       DATE,
   VEHICLE              VARCHAR(30),
   DRIVER               VARCHAR(30),
   OIL_STATION          VARCHAR(30),
   OIL_TYPE             VARCHAR(30),
   UNIT_PRICE           DOUBLE,
   AMONT                DOUBLE,
   WEIGHT               DOUBLE,
   OPERATOR             VARCHAR(14),
   REMARK               VARCHAR(50),
   PRIMARY KEY (REFUELING_ID)
);

/*==============================================================*/
/* Table: FLEET                                                 */
/*==============================================================*/
CREATE TABLE FLEET
(
   FLEET_ID             INT NOT NULL AUTO_INCREMENT,
   FLEET_NAME           VARCHAR(40),
   IS_PLUGIN            VARCHAR(2),
   MNEMONIC             VARCHAR(10),
   CONTACT              VARCHAR(10),
   CONTACT_NUMBER       VARCHAR(11),
   FAX_NUMBER           VARCHAR(15),
   CONTACT_ADDRESS      VARCHAR(50),
   BANK_OF_DEPOSIT      VARCHAR(20),
   BANK_ACCOUNT         VARCHAR(20),
   REMARKS              VARCHAR(50),
   PRIMARY KEY (FLEET_ID)
);

ALTER TABLE FLEET COMMENT '车队表';

/*==============================================================*/
/* Table: FREIGHT_NEEDTOPAY                                     */
/*==============================================================*/
CREATE TABLE FREIGHT_NEEDTOPAY
(
   SETTLE_ID            INT NOT NULL AUTO_INCREMENT,
   SETTLE_DATE          DATE,
   SETTLE_UNIT          VARCHAR(30),
   PREPAY_REMAINDER     DOUBLE,
   NEEDTOPAY            DOUBLE,
   BORROW               DOUBLE,
   PREPAY               DOUBLE,
   ACTUAL_PAY           DOUBLE,
   ACCOUNT              VARCHAR(30),
   OPERATOR             VARCHAR(14),
   REMARK               VARCHAR(50),
   PRIMARY KEY (SETTLE_ID)
);

/*==============================================================*/
/* Table: FREIGHT_NEEDTOPAY_DETAIL                              */
/*==============================================================*/
CREATE TABLE FREIGHT_NEEDTOPAY_DETAIL
(
   MXID                 INT NOT NULL AUTO_INCREMENT,
   SETTLE_ID            INT,
   DISPATCH_NO          VARCHAR(30),
   NEEDTOPAY            DOUBLE,
   ALREADY_SETTLE       DOUBLE,
   NOTHAS_SETTLE        DOUBLE,
   THIS_SETTLE          DOUBLE,
   ISPAY                VARCHAR(6),
   PRIMARY KEY (MXID)
);

/*==============================================================*/
/* Table: FREIGHT_NEEDTORECEIVE                                 */
/*==============================================================*/
CREATE TABLE FREIGHT_NEEDTORECEIVE
(
   SETTLE_ID            INT NOT NULL AUTO_INCREMENT,
   SETTLE_DATE          DATE,
   UNIT                 VARCHAR(30),
   RECEIVE_AMOUNT       DOUBLE,
   BENIFIT_AMOUNT       DOUBLE,
   PRERECEIVE           DOUBLE,
   PRERECEIVE_PAY       DOUBLE,
   ACTUAL_RECEIVE       DOUBLE,
   ACCOUNT              VARCHAR(30),
   INVOICE_NO           VARCHAR(40),
   INVOICE_AMOUNT       DOUBLE,
   OPERATOR             VARCHAR(14),
   REMARK               VARCHAR(50),
   PRIMARY KEY (SETTLE_ID)
);

/*==============================================================*/
/* Table: FREIGHT_RECEIVE_DETAIL                                */
/*==============================================================*/
CREATE TABLE FREIGHT_RECEIVE_DETAIL
(
   MXID                 INT NOT NULL AUTO_INCREMENT,
   SETTLE_ID            INT,
   DANJU_NO             VARCHAR(30),
   RECEIVE_AMOUNT       DOUBLE,
   ALDEADY_SETTLE       DOUBLE,
   NOTHAS_SETTLE        DOUBLE,
   THIS_SETTLE          DOUBLE,
   ISRECEIVE            VARCHAR(6),
   PRIMARY KEY (MXID)
);

/*==============================================================*/
/* Table: FUEL                                                  */
/*==============================================================*/
CREATE TABLE FUEL
(
   FUEL_ID              INT NOT NULL AUTO_INCREMENT,
   TYPE                 VARCHAR(14),
   UNIT_PRICE           DOUBLE,
   PRIMARY KEY (FUEL_ID)
);

/*==============================================================*/
/* Table: FULECARD                                              */
/*==============================================================*/
CREATE TABLE FULECARD
(
   FULECARD_ID          INT NOT NULL AUTO_INCREMENT,
   FULECARD_NO          VARCHAR(20),
   BUY_DATE             DATE,
   VEHICLE              VARCHAR(30),
   WARNING_AMOUNT       DOUBLE,
   INIT_AMOUNT          DOUBLE,
   CURRENT_AMOUNT       DOUBLE,
   PRIMARY KEY (FULECARD_ID)
);

/*==============================================================*/
/* Table: FULECARD_TYPE                                         */
/*==============================================================*/
CREATE TABLE FULECARD_TYPE
(
   FULECARD_ID          INT NOT NULL AUTO_INCREMENT,
   TYPE                 VARCHAR(14),
   PRIMARY KEY (FULECARD_ID)
);

/*==============================================================*/
/* Table: GOODS                                                 */
/*==============================================================*/
CREATE TABLE GOODS
(
   GOODS_ID             INT NOT NULL AUTO_INCREMENT,
   GOOD_NAME            VARCHAR(20),
   TYPE                 VARCHAR(10),
   UNIT                 VARCHAR(10),
   CODE                 VARCHAR(20),
   PRIMARY KEY (GOODS_ID)
);

/*==============================================================*/
/* Table: HANDLER                                               */
/*==============================================================*/
CREATE TABLE HANDLER
(
   HANDLER_ID           INT NOT NULL AUTO_INCREMENT,
   NAME                 VARCHAR(10),
   DEPARTMENT           VARCHAR(30),
   BIRTH                DATE,
   IDCARD               VARCHAR(20),
   TEL                  VARCHAR(15),
   ADDR                 VARCHAR(50),
   ISLEAVE              VARCHAR(4),
   REMARK               VARCHAR(50),
   PRIMARY KEY (HANDLER_ID)
);

/*==============================================================*/
/* Table: ILLEGAL                                               */
/*==============================================================*/
CREATE TABLE ILLEGAL
(
   ILLEGAL_ID           INT NOT NULL AUTO_INCREMENT,
   ILLEGAL_DATE         DATE,
   EXPEND_DATE          DATE,
   VEHICLE              VARCHAR(30),
   DRIVER               VARCHAR(30),
   LOCATION             VARCHAR(50),
   TYPE                 VARCHAR(14),
   POINT                DOUBLE,
   FINE                 DOUBLE,
   COMPANY_COST         DOUBLE,
   ACCOUNT              VARCHAR(30),
   DRIVER_COST          DOUBLE,
   REMARK               VARCHAR(50),
   PRIMARY KEY (ILLEGAL_ID)
);

/*==============================================================*/
/* Table: IOLPURCHASE_SETTLEDETAIL                              */
/*==============================================================*/
CREATE TABLE IOLPURCHASE_SETTLEDETAIL
(
   MXID                 INT NOT NULL AUTO_INCREMENT,
   SETTLE_ID            INT,
   DANJU_NO             VARCHAR(30),
   NEEDTOPAY            DOUBLE,
   ALREADY_PAY          DOUBLE,
   NOTHAS_PAY           DOUBLE,
   THIS_PAY             DOUBLE,
   ISPAY                VARCHAR(6),
   PRIMARY KEY (MXID)
);

/*==============================================================*/
/* Table: LOAD_LOCATION                                         */
/*==============================================================*/
CREATE TABLE LOAD_LOCATION
(
   ADDR_ID              INT NOT NULL AUTO_INCREMENT,
   COSUMER_ID           INT,
   ADDR                 VARCHAR(50),
   PRIMARY KEY (ADDR_ID)
);

/*==============================================================*/
/* Table: LUCA                                                  */
/*==============================================================*/
CREATE TABLE LUCA
(
   LUCA_ID              INT NOT NULL AUTO_INCREMENT,
   LUCA_NO              VARCHAR(20),
   TYPE                 VARCHAR(20),
   BUY_DATE             DATE,
   VEHICLE              VARCHAR(30),
   INIT_AMOUNT          DOUBLE,
   CURRENT_AMOUNT       DOUBLE,
   REMARK               VARCHAR(50),
   PRIMARY KEY (LUCA_ID)
);

/*==============================================================*/
/* Table: LUCA_RECHARGE                                         */
/*==============================================================*/
CREATE TABLE LUCA_RECHARGE
(
   LUCARECHARGE_ID      INT NOT NULL AUTO_INCREMENT,
   RECHARGE_DATE        DATE,
   LUCA_NO              VARCHAR(30),
   AMOUNT               DOUBLE,
   ACCOUNT              VARCHAR(30),
   OPERATOR             VARCHAR(14),
   REMARK               VARCHAR(50),
   PRIMARY KEY (LUCARECHARGE_ID)
);

/*==============================================================*/
/* Table: LUCA_TYPE                                             */
/*==============================================================*/
CREATE TABLE LUCA_TYPE
(
   LUCATYPE_ID          INT NOT NULL AUTO_INCREMENT,
   LUCA_TYPE            VARCHAR(14),
   PRIMARY KEY (LUCATYPE_ID)
);

/*==============================================================*/
/* Table: MAINTENANCE                                           */
/*==============================================================*/
CREATE TABLE MAINTENANCE
(
   MAINTENANCE_ID       INT NOT NULL AUTO_INCREMENT,
   NAME                 VARCHAR(10),
   DEPARTMENT           VARCHAR(30),
   BIRTH                DATE,
   IDCARD               VARCHAR(20),
   TEL                  VARCHAR(15),
   ADDR                 VARCHAR(50),
   ISLEAVE              VARCHAR(4),
   REMARK               VARCHAR(50),
   PRIMARY KEY (MAINTENANCE_ID)
);

ALTER TABLE MAINTENANCE COMMENT '维修工表';

/*==============================================================*/
/* Table: MAINTENANCE_ITEM                                      */
/*==============================================================*/
CREATE TABLE MAINTENANCE_ITEM
(
   MAINTITEM_ID         INT NOT NULL AUTO_INCREMENT,
   NAME                 VARCHAR(20),
   INTERVALKM           DOUBLE,
   BEFOREKM             DOUBLE,
   REMARK               VARCHAR(50),
   PRIMARY KEY (MAINTITEM_ID)
);

/*==============================================================*/
/* Table: MAINTENANCE_RECORD                                    */
/*==============================================================*/
CREATE TABLE MAINTENANCE_RECORD
(
   MAINT_ID             INT NOT NULL AUTO_INCREMENT,
   MAINT_DATE           DATE,
   VEHICLE              VARCHAR(30),
   DRIVER               VARCHAR(30),
   MAINT_PLACE          VARCHAR(30),
   MAINT_PROJECT        VARCHAR(30),
   LASTTIMEKM           DOUBLE,
   CURRENTKM            DOUBLE,
   NEXTKM               DOUBLE,
   AMOUNT               DOUBLE,
   ACCOUNT              VARCHAR(30),
   OPERATOR             VARCHAR(14),
   REMARK               VARCHAR(50),
   PRIMARY KEY (MAINT_ID)
);

/*==============================================================*/
/* Table: OFFICESUPPLIES_PURCHASE                               */
/*==============================================================*/
CREATE TABLE OFFICESUPPLIES_PURCHASE
(
   PURCHASE_ID          INT NOT NULL AUTO_INCREMENT,
   DATE                 DATE,
   GOODS                VARCHAR(30),
   QUANTITY             DOUBLE,
   UNIT_PRICE           DOUBLE,
   AMOUNT               DOUBLE,
   ACCOUNT              VARCHAR(30),
   BUYPLACE             VARCHAR(50),
   VOUCHER_NO           VARCHAR(20),
   BUYER                VARCHAR(14),
   REMARK               VARCHAR(50),
   PRIMARY KEY (PURCHASE_ID)
);

/*==============================================================*/
/* Table: OFFICESUPPLIES_USE                                    */
/*==============================================================*/
CREATE TABLE OFFICESUPPLIES_USE
(
   USE_ID               INT NOT NULL AUTO_INCREMENT,
   DATE                 DATE,
   GOODS                VARCHAR(14),
   QUANTITY             DOUBLE,
   PORPUSE              VARCHAR(30),
   RECIPIENT            VARCHAR(14),
   REMARK               VARCHAR(50),
   PRIMARY KEY (USE_ID)
);

/*==============================================================*/
/* Table: OIL_PROCUREMENT                                       */
/*==============================================================*/
CREATE TABLE OIL_PROCUREMENT
(
   OIL_PROCUREMENT      INT NOT NULL AUTO_INCREMENT,
   PROC_DATE            DATE,
   SUPPLIER             VARCHAR(30),
   OIL_TYPE             VARCHAR(30),
   OIL_TANK             VARCHAR(30),
   WEIGHT               DOUBLE,
   UNIT_PRICE           DOUBLE,
   AMOUNT               DOUBLE,
   CASHPAY              DOUBLE,
   ACCOUNT              VARCHAR(30),
   OPERATOR             VARCHAR(14),
   REMARK               VARCHAR(50),
   PRIMARY KEY (OIL_PROCUREMENT)
);

/*==============================================================*/
/* Table: OILCARD_RECHARGE                                      */
/*==============================================================*/
CREATE TABLE OILCARD_RECHARGE
(
   OILCARDRECHARGE_ID   INT NOT NULL AUTO_INCREMENT,
   DATE                 DATE,
   OILCARD_NO           VARCHAR(30),
   AMOUNT               DOUBLE,
   ACCOUNT              VARCHAR(30),
   OPERATOR             VARCHAR(14),
   REMARK               VARCHAR(50),
   PRIMARY KEY (OILCARDRECHARGE_ID)
);

/*==============================================================*/
/* Table: OILINVENTORY                                          */
/*==============================================================*/
CREATE TABLE OILINVENTORY
(
   STOCK_ID             INT NOT NULL AUTO_INCREMENT,
   TANK                 VARCHAR(30) NOT NULL,
   WEIGHT               DOUBLE,
   REMARK               VARCHAR(50),
   PRIMARY KEY (STOCK_ID)
);

/*==============================================================*/
/* Table: OILPURCHASE_NEEDTOPAY_SETTLE                          */
/*==============================================================*/
CREATE TABLE OILPURCHASE_NEEDTOPAY_SETTLE
(
   SETTLE_ID            INT NOT NULL AUTO_INCREMENT,
   SETTLE_DATE          DATE,
   SUPPLIER             VARCHAR(30),
   PREPAY_REMAINDER     DOUBLE,
   NEEDTOPAY            DOUBLE,
   PREPAY               DOUBLE,
   ACTUAL_PAY           DOUBLE,
   ACCOUNT              VARCHAR(30),
   OPERATOR             VARCHAR(14),
   REMARK               VARCHAR(14),
   PRIMARY KEY (SETTLE_ID)
);

/*==============================================================*/
/* Table: OILTANK                                               */
/*==============================================================*/
CREATE TABLE OILTANK
(
   TANK_ID              INT NOT NULL AUTO_INCREMENT,
   TANKNAME             VARCHAR(14),
   OIL_TYPE             VARCHAR(30),
   INIT_AOUNT           DOUBLE,
   LEAST_AMOUNT         DOUBLE,
   REMARK               VARCHAR(50),
   PRIMARY KEY (TANK_ID)
);

/*==============================================================*/
/* Table: ORDERS                                                */
/*==============================================================*/
CREATE TABLE ORDERS
(
   ORDER_ID             INT NOT NULL AUTO_INCREMENT,
   ORDER_TIME           DATE,
   REQUIRE_TIME         DATE,
   SHIPPER              INT,
   SHIPPER_CONTACT      VARCHAR(14),
   SHIPPER_TEL          VARCHAR(11),
   CONSIGNEE            INT,
   CONSIGNEE_CONTACT    VARCHAR(14),
   CONSIGNEE_TEL        VARCHAR(11),
   LOAD_PLACE           VARCHAR(70),
   UNLOAD_PLACE         VARCHAR(70),
   CONTRACT_NUMBER      VARCHAR(30),
   GOOD                 VARCHAR(50),
   MEASUREMENT_UNIT     VARCHAR(20),
   ROUTE                VARCHAR(30),
   ADVANCE_AMOUNT       DOUBLE,
   ISWHOLE              VARCHAR(6),
   HEAVYKM              DOUBLE,
   EMPTYKM              DOUBLE,
   LADING_NO            VARCHAR(30),
   PRICE_FORMULA        VARCHAR(28),
   UNIT_PRICE           DOUBLE,
   AMOUNT               DOUBLE,
   SETTLEMENT_WAY       VARCHAR(14),
   OPERATOR             VARCHAR(14),
   IS_FINISHED          VARCHAR(10),
   REMARK               VARCHAR(50),
   PRIMARY KEY (ORDER_ID)
);

/*==============================================================*/
/* Table: OTHERIN                                               */
/*==============================================================*/
CREATE TABLE OTHERIN
(
   IN_ID                INT NOT NULL AUTO_INCREMENT,
   DATE                 DATE,
   TYPE                 VARCHAR(30),
   VEHICLE              VARCHAR(30),
   AMOUNT               DOUBLE,
   ACCOUNT              VARCHAR(30),
   OPERATOR             VARCHAR(14),
   REMARK               VARCHAR(50),
   PRIMARY KEY (IN_ID)
);

/*==============================================================*/
/* Table: OTHERIN_TYPE                                          */
/*==============================================================*/
CREATE TABLE OTHERIN_TYPE
(
   TYPEID               INT NOT NULL AUTO_INCREMENT,
   NAME                 VARCHAR(30),
   ISHEVICLE            VARCHAR(6),
   PRIMARY KEY (TYPEID)
);

/*==============================================================*/
/* Table: OTHEROUT                                              */
/*==============================================================*/
CREATE TABLE OTHEROUT
(
   OUT_ID               INT NOT NULL AUTO_INCREMENT,
   TYPE                 VARCHAR(30),
   DATE                 DATE,
   VEHICLE              VARCHAR(30),
   AMOUNT               DOUBLE,
   ACCOUNT              VARCHAR(30),
   OPERATOR             VARCHAR(14),
   REMARK               VARCHAR(50),
   PRIMARY KEY (OUT_ID)
);

/*==============================================================*/
/* Table: OTHEROUT_TYPE                                         */
/*==============================================================*/
CREATE TABLE OTHEROUT_TYPE
(
   TYPEID               INT NOT NULL AUTO_INCREMENT,
   NAME                 VARCHAR(30),
   ISVEHICLE            VARCHAR(6),
   ISSPLITTHECOST       VARCHAR(6),
   PRIMARY KEY (TYPEID)
);

/*==============================================================*/
/* Table: PAYROLL_DETAILS                                       */
/*==============================================================*/
CREATE TABLE PAYROLL_DETAILS
(
   DETAIL_ID            INT NOT NULL AUTO_INCREMENT,
   SETTLE_ID            INT,
   NAME                 VARCHAR(30),
   TYPE                 VARCHAR(30),
   SALARY_VALUE         DOUBLE,
   COMMISSION           DOUBLE,
   ACCRUED_WAGES        DOUBLE,
   BASIC_WAGE           DOUBLE,
   RENT_SUBSIDIES       DOUBLE,
   FOOD_SUBSIDIES       DOUBLE,
   CHARGES_SUBSIDIES    DOUBLE,
   OTHER_SUBSIDIES      DOUBLE,
   REWARD               DOUBLE,
   PAY_TOTAL            DOUBLE,
   ARREARS_DEDUCTION    DOUBLE,
   ABSENTEEISM_SALARY   DOUBLE,
   DEDUCTED_PROVIDENT_FUND DOUBLE,
   OTHER_DEDUCTED       DOUBLE,
   DEDUCTIBLE_LOSS      DOUBLE,
   SALARY               DOUBLE,
   REMARK               VARCHAR(50),
   PRIMARY KEY (DETAIL_ID)
);

/*==============================================================*/
/* Table: PREPAY                                                */
/*==============================================================*/
CREATE TABLE PREPAY
(
   PREPAY_ID            INT NOT NULL AUTO_INCREMENT,
   DATE                 DATE,
   UNIT                 VARCHAR(50),
   PREPAY               DOUBLE,
   ACCOUNT              VARCHAR(30),
   ATTN                 VARCHAR(14),
   OPERATOR             VARCHAR(14),
   REMARK               VARCHAR(50),
   PRIMARY KEY (PREPAY_ID)
);

/*==============================================================*/
/* Table: PRERECEIVE                                            */
/*==============================================================*/
CREATE TABLE PRERECEIVE
(
   PRERECEIVE_ID        INT NOT NULL AUTO_INCREMENT,
   DATE                 DATE,
   UNIT                 VARCHAR(50),
   PRERECEIVE           DOUBLE,
   ACCOUNT              VARCHAR(30),
   ATTN                 VARCHAR(14),
   OPERATOR             VARCHAR(14),
   REMARK               VARCHAR(50),
   PRIMARY KEY (PRERECEIVE_ID)
);

/*==============================================================*/
/* Table: PRIMARY_AUTHORITY                                     */
/*==============================================================*/
CREATE TABLE PRIMARY_AUTHORITY
(
   PRI_ID               INT NOT NULL AUTO_INCREMENT,
   PRI_AUTHORITY        VARCHAR(20),
   PRIMARY KEY (PRI_ID)
);

/*==============================================================*/
/* Table: REPAIR                                                */
/*==============================================================*/
CREATE TABLE REPAIR
(
   REPAIR_ID            INT NOT NULL AUTO_INCREMENT,
   REPAIR_DATE          DATE,
   REPAIR_FACTORY       VARCHAR(30),
   ISINTERNAL           VARCHAR(6),
   VEHICLE              VARCHAR(30),
   DRIVER               VARCHAR(30),
   WARRANTY_NUMBER      VARCHAR(20),
   REPAIRMAN            VARCHAR(30),
   FITTING_COST         DOUBLE,
   LABOR_COST           DOUBLE,
   AMOUNT               DOUBLE,
   CASHPAY              DOUBLE,
   ACCOUNT              VARCHAR(30),
   OPERATOR             VARCHAR(14),
   REMARK               VARCHAR(50),
   PRIMARY KEY (REPAIR_ID)
);

/*==============================================================*/
/* Table: REPAIR_DETAIL                                         */
/*==============================================================*/
CREATE TABLE REPAIR_DETAIL
(
   DETAIL_ID            INT NOT NULL AUTO_INCREMENT,
   REPAIR_ID            INT,
   REPAIR_PROJECT       VARCHAR(30),
   FITTING_NO           VARCHAR(30),
   FITTING_NAME         VARCHAR(30),
   FITTING_FORMAT       VARCHAR(20),
   STOCK_AMOUNT         DOUBLE,
   NUMBER               DOUBLE,
   UNIT_PRICE           DOUBLE,
   FITTING_PRICE        DOUBLE,
   LABOUR_COST          DOUBLE,
   PRIMARY KEY (DETAIL_ID)
);

/*==============================================================*/
/* Table: REPAIR_ITEM                                           */
/*==============================================================*/
CREATE TABLE REPAIR_ITEM
(
   ITEM_ID              INT NOT NULL AUTO_INCREMENT,
   ITEM_NAME            VARCHAR(20),
   PRIMARY KEY (ITEM_ID)
);

/*==============================================================*/
/* Table: REPAIR_NEEDTOPAY                                      */
/*==============================================================*/
CREATE TABLE REPAIR_NEEDTOPAY
(
   REPAIRSETTLE_ID      INT NOT NULL AUTO_INCREMENT,
   SETTLE_DATE          DATE,
   REPAIR_FACTORY       VARCHAR(30),
   PREPAY_REMAINDER     DOUBLE,
   NEEDTOPAY            DOUBLE,
   PREPAY               DOUBLE,
   ACTUAL_PAY           DOUBLE,
   ACCOUNT              VARCHAR(30),
   OPERATOR             VARCHAR(14),
   REMARK               VARCHAR(50),
   PRIMARY KEY (REPAIRSETTLE_ID)
);

/*==============================================================*/
/* Table: REPAIR_PAY_DETAIL                                     */
/*==============================================================*/
CREATE TABLE REPAIR_PAY_DETAIL
(
   MXID                 INT NOT NULL AUTO_INCREMENT,
   REPAIRSETTLE_ID      INT NOT NULL,
   NUMBER               VARCHAR(30),
   NEEDTOPAY            DOUBLE,
   ALDEAY_PAY           DOUBLE,
   NOTHAS_PAY           DOUBLE,
   THIS_PAY             DOUBLE,
   ISPAY                VARCHAR(6),
   PRIMARY KEY (MXID)
);

/*==============================================================*/
/* Table: ROUTE                                                 */
/*==============================================================*/
CREATE TABLE ROUTE
(
   ROUTE_ID             INT NOT NULL AUTO_INCREMENT,
   ROUTE_NAME           VARCHAR(40),
   LOAD_KM              DOUBLE,
   NOLOAD_KM            DOUBLE,
   MNEMORIC             VARCHAR(14),
   PRIMARY KEY (ROUTE_ID)
);

/*==============================================================*/
/* Table: ROUTE_TEMPLATE                                        */
/*==============================================================*/
CREATE TABLE ROUTE_TEMPLATE
(
   TEMPLATE_NO          INT NOT NULL AUTO_INCREMENT,
   SHIPPER              VARCHAR(30),
   CONSIGNEE            VARCHAR(30),
   GOOD                 VARCHAR(30),
   ROUTE                VARCHAR(30),
   PRICING_FORMULA      VARCHAR(30),
   UNIT_PRICE           DOUBLE,
   REMARK               VARCHAR(50),
   PRIMARY KEY (TEMPLATE_NO)
);

/*==============================================================*/
/* Table: SALARY_TYPE                                           */
/*==============================================================*/
CREATE TABLE SALARY_TYPE
(
   SALARYTYPE_ID        INT NOT NULL AUTO_INCREMENT,
   TYPENAME             VARCHAR(30),
   TYPE                 VARCHAR(30),
   PRIMARY KEY (SALARYTYPE_ID)
);

/*==============================================================*/
/* Table: SECOND_AUTHORITY                                      */
/*==============================================================*/
CREATE TABLE SECOND_AUTHORITY
(
   SEC_ID               INT NOT NULL AUTO_INCREMENT,
   SEC_AUTHORITY        VARCHAR(20),
   BELONG_PRI_ID        INT,
   PRIMARY KEY (SEC_ID)
);

/*==============================================================*/
/* Table: SETTLE_SALARY                                         */
/*==============================================================*/
CREATE TABLE SETTLE_SALARY
(
   SETTLE_ID            INT NOT NULL AUTO_INCREMENT,
   START_DATE           DATE,
   END_DATE             DATE,
   SETTLEDATE           DATE,
   AMOUNT               DOUBLE,
   ACCOUNT              VARCHAR(30),
   REMARK               VARCHAR(50),
   PRIMARY KEY (SETTLE_ID)
);

/*==============================================================*/
/* Table: STAFF                                                 */
/*==============================================================*/
CREATE TABLE STAFF
(
   STAFF_ID             INT NOT NULL AUTO_INCREMENT,
   STAFFNAME            VARCHAR(10),
   DEPARTMENT           VARCHAR(30),
   BIRTH                DATE,
   IDCARD               VARCHAR(20),
   TEL                  VARCHAR(15),
   ADDR                 VARCHAR(50),
   ISLEAVE              VARCHAR(4),
   STAFF_REMARK         VARCHAR(50),
   PRIMARY KEY (STAFF_ID)
);

/*==============================================================*/
/* Table: STORAGE_IN                                            */
/*==============================================================*/
CREATE TABLE STORAGE_IN
(
   IN_ID                INT NOT NULL AUTO_INCREMENT,
   DATE                 DATE,
   COSTUMER             VARCHAR(30),
   VEHICLE              VARCHAR(30),
   DRIVER               VARCHAR(30),
   LOAD_FEE             DOUBLE,
   WAREHOUSING_FEE      DOUBLE,
   TRANSPORTATION       DOUBLE,
   OTHER_COST           DOUBLE,
   REMARK               VARCHAR(50),
   PRIMARY KEY (IN_ID)
);

/*==============================================================*/
/* Table: STORAGE_IN_DETAIL                                     */
/*==============================================================*/
CREATE TABLE STORAGE_IN_DETAIL
(
   DETAIL_ID            INT NOT NULL AUTO_INCREMENT,
   IN_ID                INT,
   GOOD                 VARCHAR(30),
   BATCH                VARCHAR(30),
   STORAGE              VARCHAR(30),
   MEASUREMENT_UNIT     VARCHAR(30),
   AMOUNT               DOUBLE,
   WEIGHT               DOUBLE,
   REMARK               VARCHAR(50),
   PRIMARY KEY (DETAIL_ID)
);

/*==============================================================*/
/* Table: STORAGE_OUT_DETAIL                                    */
/*==============================================================*/
CREATE TABLE STORAGE_OUT_DETAIL
(
   DETAIL_ID            INT NOT NULL AUTO_INCREMENT,
   OUT_ID               INT,
   GOOD                 VARCHAR(30),
   BATCH                VARCHAR(30),
   WAREHOUSE            VARCHAR(30),
   MEASUREMENT_UNIT     VARCHAR(30),
   AMOUNT               DOUBLE,
   WEIGHT               DOUBLE,
   REMARK               VARCHAR(50),
   PRIMARY KEY (DETAIL_ID)
);

/*==============================================================*/
/* Table: STORAGEOFOFFICESUPPLIES                               */
/*==============================================================*/
CREATE TABLE STORAGEOFOFFICESUPPLIES
(
   STOCK_ID             INT NOT NULL AUTO_INCREMENT,
   OFFICESUPPLIESNAME   VARCHAR(30),
   CURRENT_AMOUNT       DOUBLE,
   PRIMARY KEY (STOCK_ID)
);

/*==============================================================*/
/* Table: STORE_DETAIL                                          */
/*==============================================================*/
CREATE TABLE STORE_DETAIL
(
   DETAIL_ID            INT NOT NULL,
   WEIGHT               DOUBLE,
   PRIMARY KEY (DETAIL_ID)
);

/*==============================================================*/
/* Table: STOREAGE_OUT                                          */
/*==============================================================*/
CREATE TABLE STOREAGE_OUT
(
   OUT_ID               INT NOT NULL AUTO_INCREMENT,
   DATE                 DATE,
   COSTUMER             VARCHAR(30),
   VEHICLE              VARCHAR(30),
   DRIVER               VARCHAR(30),
   LOAD_FEE             DOUBLE,
   STORAGE_FEE          DOUBLE,
   TRANSPORTATION_FEE   DOUBLE,
   OTHER_FEE            DOUBLE,
   REMARK               VARCHAR(50),
   PRIMARY KEY (OUT_ID)
);

/*==============================================================*/
/* Table: STOREHOUSE                                            */
/*==============================================================*/
CREATE TABLE STOREHOUSE
(
   WAREHOUSE_ID         INT NOT NULL AUTO_INCREMENT,
   ADDR                 VARCHAR(50),
   CHARGEMAN            VARCHAR(30),
   CAPACITY             DOUBLE,
   PRIMARY KEY (WAREHOUSE_ID)
);

/*==============================================================*/
/* Table: SUPPLIER                                              */
/*==============================================================*/
CREATE TABLE SUPPLIER
(
   SUPPLIER_ID          INT NOT NULL AUTO_INCREMENT,
   ABBR                 VARCHAR(14),
   FULLNAME             VARCHAR(40),
   TYPE                 VARCHAR(14),
   CONTACT              VARCHAR(10),
   TEL                  VARCHAR(11),
   ADDR                 VARCHAR(50),
   TAX_NUMBER           VARCHAR(20),
   BANK_OF_DEPOSIT      VARCHAR(20),
   BANKACCOUNT          VARCHAR(20),
   REMARK               VARCHAR(50),
   PRIMARY KEY (SUPPLIER_ID)
);

/*==============================================================*/
/* Table: TANK_REFUEL                                           */
/*==============================================================*/
CREATE TABLE TANK_REFUEL
(
   TANKREFUEL_ID        INT NOT NULL AUTO_INCREMENT,
   REFUEL_DATE          DATE,
   VEHICLE              VARCHAR(30),
   DRIVER               VARCHAR(30),
   OIL_TANK             VARCHAR(30),
   OIL_TYPE             VARCHAR(30),
   UNIT_PRICE           DOUBLE,
   AMOUNT               DOUBLE,
   WEIGHT               DOUBLE,
   OPERATOR             VARCHAR(14),
   REMARK               VARCHAR(50),
   PRIMARY KEY (TANKREFUEL_ID)
);

/*==============================================================*/
/* Table: THIRD_AUTHORITY                                       */
/*==============================================================*/
CREATE TABLE THIRD_AUTHORITY
(
   THI_ID               INT NOT NULL AUTO_INCREMENT,
   THI_AUTHORITY        VARCHAR(20),
   URL                  VARCHAR(100),
   BELONG_SEC_ID        INT,
   PRIMARY KEY (THI_ID)
);

/*==============================================================*/
/* Table: TIRE_DATE                                             */
/*==============================================================*/
CREATE TABLE TIRE_DATE
(
   TIRE_ID              INT NOT NULL AUTO_INCREMENT,
   TIRE_NO              VARCHAR(50) NOT NULL,
   KM                   DOUBLE,
   LOCATION             VARCHAR(20),
   TYPE                 VARCHAR(20),
   BRAND                VARCHAR(20),
   STANDARD             VARCHAR(20),
   FIGURE               VARCHAR(14),
   PRODUCING_AREA       VARCHAR(14),
   SUPPLIER             VARCHAR(30),
   BUY_DATE             DATE,
   BUY_COST             DOUBLE,
   USE_DATRE            DATE,
   WHETHER_REIMBURSEMENT VARCHAR(10),
   REMARK               VARCHAR(50),
   PRIMARY KEY (TIRE_ID)
);

/*==============================================================*/
/* Table: UNLOAD_LOCATION                                       */
/*==============================================================*/
CREATE TABLE UNLOAD_LOCATION
(
   ADDR_ID              INT NOT NULL AUTO_INCREMENT,
   COSUMER_ID           INT,
   ADDR                 VARCHAR(50),
   PRIMARY KEY (ADDR_ID)
);

/*==============================================================*/
/* Table: USER                                                  */
/*==============================================================*/
CREATE TABLE USER
(
   USER_ID              INT NOT NULL AUTO_INCREMENT,
   USER_NAME            VARCHAR(30) NOT NULL,
   PASSWD               VARCHAR(30),
   PRIMARY KEY (USER_ID)
);

/*==============================================================*/
/* Table: USER_AUTHORITY                                        */
/*==============================================================*/
CREATE TABLE USER_AUTHORITY
(
   AUTHORITY_RECORD_ID  INT NOT NULL AUTO_INCREMENT,
   USER_ID              INT,
   THI_AUTHORITY_ID     INT,
   PRIMARY KEY (AUTHORITY_RECORD_ID)
);

/*==============================================================*/
/* Table: VEHICLE                                               */
/*==============================================================*/
CREATE TABLE VEHICLE
(
   VEHICLE_ID           INT NOT NULL AUTO_INCREMENT,
   LICENSE_PLATE        VARCHAR(20),
   FLEET                VARCHAR(30),
   TYPE                 VARCHAR(10),
   DEFAULT_DRAG         VARCHAR(10),
   VEHICLE_TYPE         CHAR(10),
   MILEAGE              DOUBLE,
   RATIFIED_LOAD        DOUBLE,
   OIL_CONSUMPTION      DOUBLE,
   EMPTY_CONSUMPTION    DOUBLE,
   MONTHLY_DEPRECIATION DOUBLE,
   ENGINE_NUMBER        VARCHAR(20),
   INSURANCE_NUMBER     VARCHAR(20),
   FRAME_NUMBER         VARCHAR(20),
   CHASSIS_NUMBER       VARCHAR(20),
   REMARKS              VARCHAR(50),
   PRIMARY KEY (VEHICLE_ID)
);

ALTER TABLE VEHICLE COMMENT '车辆表';

/*==============================================================*/
/* Table: VEHICLE_FEES                                          */
/*==============================================================*/
CREATE TABLE VEHICLE_FEES
(
   VEHICLE_FEES_ID      INT NOT NULL AUTO_INCREMENT,
   FEES_DATE            DATE,
   VEHICLE              VARCHAR(30),
   FEE_TYPE             VARCHAR(30),
   AMOUNT               DOUBLE,
   EXPIRE_DATE          DATE,
   CASHPAY              DOUBLE,
   ACCOUNT              VARCHAR(30),
   OPERATOR             VARCHAR(14),
   REMARK               VARCHAR(50),
   PRIMARY KEY (VEHICLE_FEES_ID)
);

/*==============================================================*/
/* Table: VEHICLEFEES_TYPE                                      */
/*==============================================================*/
CREATE TABLE VEHICLEFEES_TYPE
(
   TYPE_ID              INT NOT NULL AUTO_INCREMENT,
   NAME                 VARCHAR(20),
   PRIMARY KEY (TYPE_ID)
);

/*==============================================================*/
/* Table: VEHICLEMODEL                                          */
/*==============================================================*/
CREATE TABLE VEHICLEMODEL
(
   MODLE_ID             INT NOT NULL AUTO_INCREMENT,
   VEHICLEMODLE         VARCHAR(14),
   PRIMARY KEY (MODLE_ID)
);

ALTER TABLE ADDOIL_PAY_DETAIL ADD CONSTRAINT FK_REFERENCE_10 FOREIGN KEY (SETTLE_ID)
      REFERENCES ADDOIL_NEEDTOPAYSETTLE (SETTLE_ID) ON DELETE RESTRICT ON UPDATE RESTRICT;

ALTER TABLE DISPATCH_DETAIL ADD CONSTRAINT FK_REFERENCE_2 FOREIGN KEY (DISPATCH_ID)
      REFERENCES DISPATCH (DISPATCH_ID) ON DELETE RESTRICT ON UPDATE RESTRICT;

ALTER TABLE FITTING_NEEDTOPAY_DETAIL ADD CONSTRAINT FK_REFERENCE_8 FOREIGN KEY (SETTLE_ID)
      REFERENCES FITTING_NEEDTOPAY_SETTLE (SETTLE_ID) ON DELETE RESTRICT ON UPDATE RESTRICT;

ALTER TABLE FITTINGPURCHASE_DETAIL ADD CONSTRAINT FK_REFERENCE_5 FOREIGN KEY (PURCHASE_ID)
      REFERENCES FITTING_PURCHASE (PURCHASE_ID) ON DELETE RESTRICT ON UPDATE RESTRICT;

ALTER TABLE FREIGHT_NEEDTOPAY_DETAIL ADD CONSTRAINT FK_REFERENCE_6 FOREIGN KEY (SETTLE_ID)
      REFERENCES FREIGHT_NEEDTOPAY (SETTLE_ID) ON DELETE RESTRICT ON UPDATE RESTRICT;

ALTER TABLE FREIGHT_RECEIVE_DETAIL ADD CONSTRAINT FK_REFERENCE_11 FOREIGN KEY (SETTLE_ID)
      REFERENCES FREIGHT_NEEDTORECEIVE (SETTLE_ID) ON DELETE RESTRICT ON UPDATE RESTRICT;

ALTER TABLE IOLPURCHASE_SETTLEDETAIL ADD CONSTRAINT FK_REFERENCE_9 FOREIGN KEY (SETTLE_ID)
      REFERENCES OILPURCHASE_NEEDTOPAY_SETTLE (SETTLE_ID) ON DELETE RESTRICT ON UPDATE RESTRICT;

ALTER TABLE LOAD_LOCATION ADD CONSTRAINT FK_REFERENCE_3 FOREIGN KEY (COSUMER_ID)
      REFERENCES COSTUMER (COSUMER_ID) ON DELETE RESTRICT ON UPDATE RESTRICT;

ALTER TABLE PAYROLL_DETAILS ADD CONSTRAINT FK_REFERENCE_15 FOREIGN KEY (SETTLE_ID)
      REFERENCES SETTLE_SALARY (SETTLE_ID) ON DELETE RESTRICT ON UPDATE RESTRICT;

ALTER TABLE REPAIR_DETAIL ADD CONSTRAINT FK_REFERENCE_12 FOREIGN KEY (REPAIR_ID)
      REFERENCES REPAIR (REPAIR_ID) ON DELETE RESTRICT ON UPDATE RESTRICT;

ALTER TABLE REPAIR_PAY_DETAIL ADD CONSTRAINT FK_REFERENCE_7 FOREIGN KEY (REPAIRSETTLE_ID)
      REFERENCES REPAIR_NEEDTOPAY (REPAIRSETTLE_ID) ON DELETE RESTRICT ON UPDATE RESTRICT;

ALTER TABLE SECOND_AUTHORITY ADD CONSTRAINT FK_REFERENCE_16 FOREIGN KEY (BELONG_PRI_ID)
      REFERENCES PRIMARY_AUTHORITY (PRI_ID) ON DELETE RESTRICT ON UPDATE RESTRICT;

ALTER TABLE STORAGE_IN_DETAIL ADD CONSTRAINT FK_REFERENCE_13 FOREIGN KEY (IN_ID)
      REFERENCES STORAGE_IN (IN_ID) ON DELETE RESTRICT ON UPDATE RESTRICT;

ALTER TABLE STORAGE_OUT_DETAIL ADD CONSTRAINT FK_REFERENCE_14 FOREIGN KEY (OUT_ID)
      REFERENCES STOREAGE_OUT (OUT_ID) ON DELETE RESTRICT ON UPDATE RESTRICT;

ALTER TABLE THIRD_AUTHORITY ADD CONSTRAINT FK_REFERENCE_17 FOREIGN KEY (BELONG_SEC_ID)
      REFERENCES SECOND_AUTHORITY (SEC_ID) ON DELETE RESTRICT ON UPDATE RESTRICT;

ALTER TABLE UNLOAD_LOCATION ADD CONSTRAINT FK_REFERENCE_4 FOREIGN KEY (COSUMER_ID)
      REFERENCES COSTUMER (COSUMER_ID) ON DELETE RESTRICT ON UPDATE RESTRICT;

ALTER TABLE USER_AUTHORITY ADD CONSTRAINT FK_REFERENCE_18 FOREIGN KEY (THI_AUTHORITY_ID)
      REFERENCES THIRD_AUTHORITY (THI_ID) ON DELETE RESTRICT ON UPDATE RESTRICT;

ALTER TABLE USER_AUTHORITY ADD CONSTRAINT FK_REFERENCE_19 FOREIGN KEY (USER_ID)
      REFERENCES USER (USER_ID) ON DELETE RESTRICT ON UPDATE RESTRICT;

