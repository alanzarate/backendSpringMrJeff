-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2022-11-17 19:14:28.171

-- tables
-- Table: H_MR_ADDRESS
CREATE TABLE H_MR_ADDRESS (
    H_MR_ADDRESS_ID serial  NOT NULL,
    MR_ADDRESS_ID int  NOT NULL,
    LATITUDE decimal(22,16)  NOT NULL,
    LONGITUDE decimal(22,16)  NOT NULL,
    NAME varchar(100)  NOT NULL,
    DETAIL varchar(100)  NOT NULL,
    ADDRESS_LINK varchar(254)  NOT NULL,
    STATUS smallint  NOT NULL,
    TX_DATE timestamp  NOT NULL,
    TX_USER varchar(50)  NOT NULL,
    TX_HOST varchar(50)  NOT NULL,
    CONSTRAINT H_MR_ADDRESS_pk PRIMARY KEY (H_MR_ADDRESS_ID)
);

-- Table: H_MR_ADDRESS_USER
CREATE TABLE H_MR_ADDRESS_USER (
    H_MR_ADDRESS_USER_ID serial  NOT NULL,
    MR_ADDRESS_USER_ID int  NOT NULL,
    MR_ADDRESS_ID int  NOT NULL,
    MR_USER_ID int  NOT NULL,
    STATUS smallint  NOT NULL,
    TX_DATE timestamp  NOT NULL,
    TX_USER varchar(60)  NOT NULL,
    TX_HOST varchar(60)  NOT NULL,
    CONSTRAINT H_MR_ADDRESS_USER_pk PRIMARY KEY (H_MR_ADDRESS_USER_ID)
);

-- Table: H_MR_BRANCH
CREATE TABLE H_MR_BRANCH (
    H_MR_BRANCH_ID serial  NOT NULL,
    MR_BRANCH_ID int  NOT NULL,
    BRANCH_NAME varchar(100)  NOT NULL,
    LATITUDE decimal(22,16)  NOT NULL,
    LONGITUDE decimal(22,16)  NOT NULL,
    ADDRESS_LINK varchar(254)  NOT NULL,
    CAT_BRANCH_STATUS varchar(63)  NOT NULL,
    ATENTION_RATIO_M int  NOT NULL,
    STATUS smallint  NOT NULL,
    TX_DATE timestamp  NOT NULL,
    TX_USER varchar(60)  NOT NULL,
    TX_HOST varchar(60)  NOT NULL,
    CONSTRAINT H_MR_BRANCH_pk PRIMARY KEY (H_MR_BRANCH_ID)
);

-- Table: H_MR_BRANCH_USER
CREATE TABLE H_MR_BRANCH_USER (
    H_MR_BRANCH_USER_ID serial  NOT NULL,
    MR_BRANCH_USER_ID int  NOT NULL,
    MR_USER_ID int  NOT NULL,
    MR_BRANCH_ID int  NOT NULL,
    STATUS smallint  NOT NULL,
    TX_DATE timestamp  NOT NULL,
    TX_USER varchar(60)  NOT NULL,
    TX_HOST varchar(60)  NOT NULL,
    CONSTRAINT H_MR_BRANCH_USER_pk PRIMARY KEY (H_MR_BRANCH_USER_ID)
);

-- Table: H_MR_CATEGORY_CLOTH
CREATE TABLE H_MR_CATEGORY_CLOTH (
    H_MR_CATEGORY_CLOTH_ID serial  NOT NULL,
    MR_CATEGORY_CLOTH_ID int  NOT NULL,
    CATEGORY varchar(63)  NOT NULL,
    STATUS smallint  NOT NULL,
    TX_DATE timestamp  NOT NULL,
    TX_USER varchar(60)  NOT NULL,
    TX_HOST varchar(60)  NOT NULL,
    CONSTRAINT H_MR_CATEGORY_CLOTH_pk PRIMARY KEY (H_MR_CATEGORY_CLOTH_ID)
);

-- Table: H_MR_CLOTHING
CREATE TABLE H_MR_CLOTHING (
    H_MR_CLOTHING_ID serial  NOT NULL,
    MR_CLOTHING_ID int  NOT NULL,
    TITLE varchar(100)  NOT NULL,
    DESCRIPTION varchar(400)  NOT NULL,
    PRICE decimal(12,4)  NOT NULL,
    CAT_CLOT_STATUS varchar(50)  NOT NULL,
    MR_CATEGORY_CLOTH_ID int  NOT NULL,
    STATUS smallint  NOT NULL,
    TX_DATE timestamp  NOT NULL,
    TX_USER varchar(50)  NOT NULL,
    TX_HOST varchar(50)  NOT NULL,
    CONSTRAINT H_MR_CLOTHING_pk PRIMARY KEY (H_MR_CLOTHING_ID)
);

-- Table: H_MR_CLOTHING_IMAGES
CREATE TABLE H_MR_CLOTHING_IMAGES (
    H_MR_CLOTHING_IMAGES_ID serial  NOT NULL,
    MR_CLOTHING_IMAGES_ID int  NOT NULL,
    URL varchar(254)  NOT NULL,
    MR_CLOTHING_ID int  NOT NULL,
    PRINCIPAL_IMAGE smallint  NOT NULL,
    STATUS smallint  NOT NULL,
    TX_DATE timestamp  NOT NULL,
    TX_USER varchar(60)  NOT NULL,
    TX_HOST varchar(60)  NOT NULL,
    CONSTRAINT H_MR_CLOTHING_IMAGES_pk PRIMARY KEY (H_MR_CLOTHING_IMAGES_ID)
);

-- Table: H_MR_CLOTHING_ORDER
CREATE TABLE H_MR_CLOTHING_ORDER (
    H_MR_CLOTHING_ORDER_ID serial  NOT NULL,
    MR_CLOTHING_ORDER_ID int  NOT NULL,
    PRICE decimal(10,2)  NOT NULL,
    QUANTITY int  NOT NULL,
    MR_SERVICE_ID int  NOT NULL,
    MR_ORDER_ID int  NOT NULL,
    STATUS smallint  NOT NULL,
    TX_DATE timestamp  NOT NULL,
    TX_USER varchar(60)  NOT NULL,
    TX_HOST varchar(60)  NOT NULL,
    CONSTRAINT H_MR_CLOTHING_ORDER_pk PRIMARY KEY (H_MR_CLOTHING_ORDER_ID)
);

-- Table: H_MR_COUPONS
CREATE TABLE H_MR_COUPONS (
    H_MR_COUPONS_ID serial  NOT NULL,
    MR_COUPONS_ID int  NOT NULL,
    DETAIL varchar(100)  NOT NULL,
    CODE varchar(100)  NOT NULL,
    DATE_CREATED date  NOT NULL,
    DATE_EXPIRATION date  NOT NULL,
    DISCOUNT_PER decimal(9,6)  NOT NULL,
    STATUS smallint  NOT NULL,
    TX_DATE timestamp  NOT NULL,
    TX_USER varchar(60)  NOT NULL,
    TX_HOST varchar(60)  NOT NULL,
    CONSTRAINT H_MR_COUPONS_pk PRIMARY KEY (H_MR_COUPONS_ID)
);

-- Table: H_MR_DELIVER
CREATE TABLE H_MR_DELIVER (
    H_MR_DELIVER_ID serial  NOT NULL,
    MR_DELIVER_ID int  NOT NULL,
    DATE_OPE date  NOT NULL,
    MR_OPERATION_STATE_ID int  NOT NULL,
    MR_ADDRESS_ID int  NOT NULL,
    MR_USER_ID int  NOT NULL,
    MR_SCHEDULE_ID int  NOT NULL,
    MR_ORDER_ID int  NOT NULL,
    CODE_GEN varchar(256)  NOT NULL,
    STATUS smallint  NOT NULL,
    TX_DATE timestamp  NOT NULL,
    TX_USER varchar(60)  NOT NULL,
    TX_HOST varchar(60)  NOT NULL,
    CONSTRAINT H_MR_DELIVER_pk PRIMARY KEY (H_MR_DELIVER_ID)
);

-- Table: H_MR_GROUP
CREATE TABLE H_MR_GROUP (
    H_MR_GROUP_ID serial  NOT NULL,
    MR_GROUP_ID int  NOT NULL,
    DETAIL varchar(200)  NOT NULL,
    CAT_GROUP varchar(50)  NOT NULL,
    STATUS smallint  NOT NULL,
    TX_DATE timestamp  NOT NULL,
    TX_USER varchar(50)  NOT NULL,
    TX_HOST varchar(50)  NOT NULL,
    CONSTRAINT H_MR_GROUP_pk PRIMARY KEY (H_MR_GROUP_ID)
);

-- Table: H_MR_GROUP_ROLE
CREATE TABLE H_MR_GROUP_ROLE (
    H_MR_GROUP_ROLE_ID serial  NOT NULL,
    MR_GROUP_ROLE int  NOT NULL,
    MR_GROUP_ID int  NOT NULL,
    MR_ROLE_ID int  NOT NULL,
    STATUS smallint  NOT NULL,
    TX_DATE timestamp  NOT NULL,
    TX_USER varchar(50)  NOT NULL,
    TX_HOST varchar(50)  NOT NULL,
    CONSTRAINT H_MR_GROUP_ROLE_pk PRIMARY KEY (H_MR_GROUP_ROLE_ID)
);

-- Table: H_MR_HOLIDAYS
CREATE TABLE H_MR_HOLIDAYS (
    H_MR_HOLIDAYS_ID serial  NOT NULL,
    MR_HOLIDAYS_ID int  NOT NULL,
    DATE_HOLIDAY date  NOT NULL,
    DETAIL varchar(200)  NOT NULL,
    STATUS smallint  NOT NULL,
    TX_DATE timestamp  NOT NULL,
    TX_USER varchar(60)  NOT NULL,
    TX_HOST varchar(60)  NOT NULL,
    CONSTRAINT H_MR_HOLIDAYS_pk PRIMARY KEY (H_MR_HOLIDAYS_ID)
);

-- Table: H_MR_INVOICE
CREATE TABLE H_MR_INVOICE (
    H_MR_INVOICE_ID serial  NOT NULL,
    MR_INVOICE_ID int  NOT NULL,
    NAME varchar(100)  NOT NULL,
    NIT varchar(20)  NOT NULL,
    STATUS smallint  NOT NULL,
    TX_DATE timestamp  NOT NULL,
    TX_USER varchar(60)  NOT NULL,
    TX_HOST varchar(60)  NOT NULL,
    CONSTRAINT H_MR_INVOICE_pk PRIMARY KEY (H_MR_INVOICE_ID)
);

-- Table: H_MR_INVOICE_USER
CREATE TABLE H_MR_INVOICE_USER (
    H_MR_INVOICE_USER_ID serial  NOT NULL,
    MR_INVOICE_USER_ID int  NOT NULL,
    MR_INVOICE_ID int  NOT NULL,
    MR_USER_ID int  NOT NULL,
    STATUS int  NOT NULL,
    TX_DATE timestamp  NOT NULL,
    TX_USER varchar(60)  NOT NULL,
    TX_HOST varchar(60)  NOT NULL,
    CONSTRAINT H_MR_INVOICE_USER_pk PRIMARY KEY (H_MR_INVOICE_USER_ID)
);

-- Table: H_MR_OPERATION_STATE
CREATE TABLE H_MR_OPERATION_STATE (
    H_MR_OPERATION_STATE_ID serial  NOT NULL,
    MR_OPERATION_STATE_ID int  NOT NULL,
    STATE varchar(128)  NOT NULL,
    FOR_OPERATION varchar(64)  NOT NULL,
    DESCRIPTION_STATE varchar(256)  NOT NULL,
    SHOULD_SHOW smallint  NOT NULL,
    STATUS smallint  NOT NULL,
    TX_DATE timestamp  NOT NULL,
    TX_USER varchar(60)  NOT NULL,
    TX_HOST varchar(60)  NOT NULL,
    CONSTRAINT H_MR_OPERATION_STATE_pk PRIMARY KEY (H_MR_OPERATION_STATE_ID)
);

-- Table: H_MR_ORDER
CREATE TABLE H_MR_ORDER (
    H_MR_ORDER_ID serial  NOT NULL,
    MR_ORDER_ID int  NOT NULL,
    COMMENT varchar(511)  NOT NULL,
    MR_COUPONS_ID int  NULL,
    MR_USER_ID int  NOT NULL,
    MR_OPERATION_STATE_ID int  NOT NULL,
    MR_PAYMENT_METHOD_ID int  NULL,
    PAY_CASH smallint  NOT NULL,
    MR_INVOICE_ID int  NULL,
    STATUS smallint  NOT NULL,
    TX_DATE timestamp  NOT NULL,
    TX_USER varchar(60)  NOT NULL,
    TX_HOST varchar(60)  NOT NULL,
    CONSTRAINT H_MR_ORDER_pk PRIMARY KEY (H_MR_ORDER_ID)
);

-- Table: H_MR_PAYMENT_METHOD
CREATE TABLE H_MR_PAYMENT_METHOD (
    H_MR_PAYMENT_METHOD_ID serial  NOT NULL,
    MR_PAYMENT_METHOD_ID int  NOT NULL,
    NAME varchar(50)  NOT NULL,
    LAST_NUMBERS int  NOT NULL,
    CAD varchar(400)  NOT NULL,
    CVC2 varchar(400)  NOT NULL,
    NUMBER varchar(400)  NOT NULL,
    STATUS smallint  NOT NULL,
    TX_DATE timestamp  NOT NULL,
    TX_USER varchar(60)  NOT NULL,
    TX_HOST varchar(60)  NOT NULL,
    CONSTRAINT H_MR_PAYMENT_METHOD_pk PRIMARY KEY (H_MR_PAYMENT_METHOD_ID)
);

-- Table: H_MR_PAYMENT_METHOD_USER
CREATE TABLE H_MR_PAYMENT_METHOD_USER (
    H_MR_PAYMENT_METHOD_USER_ID serial  NOT NULL,
    MR_PAYMENT_METHOD_USER_ID int  NOT NULL,
    MR_PAYMENT_METHOD_ID int  NOT NULL,
    MR_USER_ID int  NOT NULL,
    STATUS int  NOT NULL,
    TX_DATE timestamp  NOT NULL,
    TX_USER varchar(60)  NOT NULL,
    TX_HOST varchar(60)  NOT NULL,
    CONSTRAINT H_MR_PAYMENT_METHOD_USER_pk PRIMARY KEY (H_MR_PAYMENT_METHOD_USER_ID)
);

-- Table: H_MR_PERSON
CREATE TABLE H_MR_PERSON (
    H_MR_PERSON_ID serial  NOT NULL,
    MR_PERSON_ID int  NOT NULL,
    FIRST_NAME varchar(50)  NOT NULL,
    LAST_NAME varchar(50)  NOT NULL,
    NUM_PHONE varchar(20)  NOT NULL,
    GENDER_PERSON int  NOT NULL,
    CAT_PER_STATUS varchar(50)  NOT NULL,
    STATUS smallint  NOT NULL,
    TX_DATE timestamp  NOT NULL,
    TX_USER varchar(50)  NOT NULL,
    TX_HOST varchar(50)  NOT NULL,
    CONSTRAINT H_MR_PERSON_pk PRIMARY KEY (H_MR_PERSON_ID)
);

-- Table: H_MR_PICKUP
CREATE TABLE H_MR_PICKUP (
    H_MR_PICKUP_ID serial  NOT NULL,
    MR_PICKUP_ID int  NOT NULL,
    DATE_OPE date  NOT NULL,
    MR_OPERATION_STATE_ID int  NOT NULL,
    MR_ADDRESS_ID int  NOT NULL,
    MR_USER_ID int  NOT NULL,
    MR_SCHEDULE_ID int  NOT NULL,
    MR_ORDER_ID int  NOT NULL,
    CODE_GEN varchar(256)  NOT NULL,
    STATUS smallint  NOT NULL,
    TX_DATE timestamp  NOT NULL,
    TX_USER varchar(60)  NOT NULL,
    TX_HOST varchar(60)  NOT NULL,
    CONSTRAINT H_MR_PICKUP_pk PRIMARY KEY (H_MR_PICKUP_ID)
);

-- Table: H_MR_ROLE
CREATE TABLE H_MR_ROLE (
    H_MR_ROLE_ID serial  NOT NULL,
    MR_ROLE_ID int  NOT NULL,
    DETAIL varchar(200)  NOT NULL,
    CAT_ROLE varchar(50)  NOT NULL,
    STATUS smallint  NOT NULL,
    TX_DATE timestamp  NOT NULL,
    TX_USER varchar(50)  NOT NULL,
    TX_HOST varchar(50)  NOT NULL,
    CONSTRAINT H_MR_ROLE_pk PRIMARY KEY (H_MR_ROLE_ID)
);

-- Table: H_MR_SCHEDULE
CREATE TABLE H_MR_SCHEDULE (
    H_MR_SCHEDULE_ID serial  NOT NULL,
    MR_SCHEDULE_ID int  NOT NULL,
    TIME_START timestamp  NOT NULL,
    TIME_END timestamp  NOT NULL,
    DETAIL varchar(200)  NOT NULL,
    STATUS smallint  NOT NULL,
    TX_DATE timestamp  NOT NULL,
    TX_USER varchar(60)  NOT NULL,
    TX_HOST varchar(60)  NOT NULL,
    CONSTRAINT H_MR_SCHEDULE_pk PRIMARY KEY (H_MR_SCHEDULE_ID)
);

-- Table: H_MR_SERVICE
CREATE TABLE H_MR_SERVICE (
    H_MR_SERVICE_ID serial  NOT NULL,
    MR_SERVICE_ID int  NOT NULL,
    PRICE decimal(10,2)  NOT NULL,
    CAT_SER_STATUS varchar(50)  NOT NULL,
    MR_SERVICE_DETAIL_ID int  NOT NULL,
    MR_CLOTHING_ID int  NOT NULL,
    PRINCIPAL_SERVICE smallint  NOT NULL,
    MR_SIZE_ID int  NOT NULL,
    STATUS smallint  NOT NULL,
    TX_DATE timestamp  NOT NULL,
    TX_USER varchar(50)  NOT NULL,
    TX_HOST varchar(50)  NOT NULL,
    CONSTRAINT H_MR_SERVICE_pk PRIMARY KEY (H_MR_SERVICE_ID)
);

-- Table: H_MR_SERVICE_DETAIL
CREATE TABLE H_MR_SERVICE_DETAIL (
    H_MR_SERVICE_DETAIL_ID serial  NOT NULL,
    MR_SERVICE_DETAIL_ID int  NOT NULL,
    TITLE varchar(100)  NOT NULL,
    DESCRIPTION varchar(400)  NOT NULL,
    STATUS smallint  NOT NULL,
    TX_DATE timestamp  NOT NULL,
    TX_USER varchar(50)  NOT NULL,
    TX_HOST varchar(50)  NOT NULL,
    CONSTRAINT H_MR_SERVICE_DETAIL_pk PRIMARY KEY (H_MR_SERVICE_DETAIL_ID)
);

-- Table: H_MR_SIZE
CREATE TABLE H_MR_SIZE (
    H_MR_SIZE_ID serial  NOT NULL,
    MR_SIZE_ID int  NOT NULL,
    SIZE varchar(16)  NOT NULL,
    STATUS int  NOT NULL,
    TX_DATE timestamp  NOT NULL,
    TX_USER varchar(60)  NOT NULL,
    TX_HOST varchar(60)  NOT NULL,
    CONSTRAINT H_MR_SIZE_pk PRIMARY KEY (H_MR_SIZE_ID)
);

-- Table: H_MR_USER
CREATE TABLE H_MR_USER (
    H_MR_USER_ID serial  NOT NULL,
    MR_USER_ID int  NOT NULL,
    USERNAME varchar(100)  NOT NULL,
    SECRET varchar(400)  NOT NULL,
    EMAIL varchar(254)  NOT NULL,
    CAT_USER_STATUS varchar(60)  NOT NULL,
    MR_PERSON_ID int  NOT NULL,
    STATUS smallint  NOT NULL,
    TX_DATE timestamp  NOT NULL,
    TX_USER varchar(50)  NOT NULL,
    TX_HOST varchar(50)  NOT NULL,
    CONSTRAINT H_MR_USER_pk PRIMARY KEY (H_MR_USER_ID)
);

-- Table: H_MR_USER_GROUP
CREATE TABLE H_MR_USER_GROUP (
    H_MR_USER_GROUP_ID serial  NOT NULL,
    MR_USER_GROUP_ID int  NOT NULL,
    MR_USER_ID int  NOT NULL,
    MR_GROUP_ID int  NOT NULL,
    STATUS smallint  NOT NULL,
    TX_DATE timestamp  NOT NULL,
    TX_USER varchar(50)  NOT NULL,
    TX_HOST varchar(50)  NOT NULL,
    CONSTRAINT H_MR_USER_GROUP_pk PRIMARY KEY (H_MR_USER_GROUP_ID)
);

-- Table: MR_ADDRESS
    CREATE TABLE MR_ADDRESS (
        MR_ADDRESS_ID serial  NOT NULL,
        LATITUDE decimal(22,16)  NOT NULL,
        LONGITUDE decimal(22,16)  NOT NULL,
        NAME varchar(100)  NOT NULL,
        DETAIL varchar(100)  NOT NULL,
        ADDRESS_LINK varchar(254)  NOT NULL,
        STATUS smallint  NOT NULL,
        TX_DATE timestamp  NOT NULL,
        TX_USER varchar(50)  NOT NULL,
        TX_HOST varchar(50)  NOT NULL,
        CREATED timestamp  NOT NULL,
        CONSTRAINT MR_ADDRESS_pk PRIMARY KEY (MR_ADDRESS_ID)
    );

    -- Table: MR_ADDRESS_USER
    CREATE TABLE MR_ADDRESS_USER (
        MR_ADDRESS_USER_ID serial  NOT NULL,
        MR_ADDRESS_ID int  NOT NULL,
        MR_USER_ID int  NOT NULL,
        STATUS smallint  NOT NULL,
        TX_DATE timestamp  NOT NULL,
        TX_USER varchar(60)  NOT NULL,
        TX_HOST varchar(60)  NOT NULL,
        CREATED timestamp  NOT NULL,
        CONSTRAINT MR_ADDRESS_USER_pk PRIMARY KEY (MR_ADDRESS_USER_ID)
    );

-- Table: MR_BRANCH
CREATE TABLE MR_BRANCH (
    MR_BRANCH_ID serial  NOT NULL,
    BRANCH_NAME varchar(100)  NOT NULL,
    LATITUDE decimal(22,16)  NOT NULL,
    LONGITUDE decimal(22,16)  NOT NULL,
    ADDRESS_LINK varchar(254)  NOT NULL,
    CAT_BRANCH_STATUS varchar(63)  NOT NULL,
    ATENTION_RATIO_M int  NOT NULL,
    STATUS smallint  NOT NULL,
    TX_DATE timestamp  NOT NULL,
    TX_USER varchar(60)  NOT NULL,
    TX_HOST varchar(60)  NOT NULL,
    CREATED timestamp  NOT NULL,
    CONSTRAINT MR_BRANCH_pk PRIMARY KEY (MR_BRANCH_ID)
);

-- Table: MR_BRANCH_USER
CREATE TABLE MR_BRANCH_USER (
    MR_BRANCH_USER_ID serial  NOT NULL,
    MR_USER_ID int  NOT NULL,
    MR_BRANCH_ID int  NOT NULL,
    STATUS smallint  NOT NULL,
    TX_DATE timestamp  NOT NULL,
    TX_USER varchar(60)  NOT NULL,
    TX_HOST varchar(60)  NOT NULL,
    CREATED timestamp  NOT NULL,
    CONSTRAINT MR_BRANCH_USER_pk PRIMARY KEY (MR_BRANCH_USER_ID)
);

-- Table: MR_CATEGORY_CLOTH
CREATE TABLE MR_CATEGORY_CLOTH (
    MR_CATEGORY_CLOTH_ID serial  NOT NULL,
    CATEGORY varchar(63)  NOT NULL,
    STATUS smallint  NOT NULL,
    TX_DATE timestamp  NOT NULL,
    TX_USER varchar(60)  NOT NULL,
    TX_HOST varchar(60)  NOT NULL,
    CREATED timestamp  NOT NULL,
    CONSTRAINT MR_CATEGORY_CLOTH_pk PRIMARY KEY (MR_CATEGORY_CLOTH_ID)
);

-- Table: MR_CLOTHING
CREATE TABLE MR_CLOTHING (
    MR_CLOTHING_ID serial  NOT NULL,
    TITLE varchar(100)  NOT NULL,
    DESCRIPTION varchar(400)  NOT NULL,
    PRICE decimal(12,4)  NOT NULL,
    CAT_CLOT_STATUS varchar(50)  NOT NULL,
    MR_CATEGORY_CLOTH_ID int  NOT NULL,
    STATUS smallint  NOT NULL,
    TX_DATE timestamp  NOT NULL,
    TX_USER varchar(50)  NOT NULL,
    TX_HOST varchar(50)  NOT NULL,
    CREATED timestamp  NOT NULL,
    CONSTRAINT MR_CLOTHING_pk PRIMARY KEY (MR_CLOTHING_ID)
);

-- Table: MR_CLOTHING_IMAGES
CREATE TABLE MR_CLOTHING_IMAGES (
    MR_CLOTHING_IMAGES_ID serial  NOT NULL,
    URL varchar(254)  NOT NULL,
    MR_CLOTHING_ID int  NOT NULL,
    PRINCIPAL_IMAGE smallint  NOT NULL,
    STATUS smallint  NOT NULL,
    TX_DATE timestamp  NOT NULL,
    TX_USER varchar(60)  NOT NULL,
    TX_HOST varchar(60)  NOT NULL,
    CREATED timestamp  NOT NULL,
    CONSTRAINT MR_CLOTHING_IMAGES_pk PRIMARY KEY (MR_CLOTHING_IMAGES_ID)
);

-- Table: MR_CLOTHING_ORDER
CREATE TABLE MR_CLOTHING_ORDER (
    MR_CLOTHING_ORDER_ID serial  NOT NULL,
    PRICE decimal(10,2)  NOT NULL,
    QUANTITY int  NOT NULL,
    MR_SERVICE_ID int  NOT NULL,
    MR_ORDER_ID int  NOT NULL,
    STATUS smallint  NOT NULL,
    TX_DATE timestamp  NOT NULL,
    TX_USER varchar(60)  NOT NULL,
    TX_HOST varchar(60)  NOT NULL,
    CREATED timestamp  NOT NULL,
    CONSTRAINT MR_CLOTHING_ORDER_pk PRIMARY KEY (MR_CLOTHING_ORDER_ID)
);

-- Table: MR_COUPONS
CREATE TABLE MR_COUPONS (
    MR_COUPONS_ID serial  NOT NULL,
    DETAIL varchar(100)  NOT NULL,
    CODE varchar(100)  NOT NULL,
    DATE_CREATED date  NOT NULL,
    DATE_EXPIRATION date  NOT NULL,
    DISCOUNT_PER decimal(9,6)  NOT NULL,
    STATUS smallint  NOT NULL,
    TX_DATE timestamp  NOT NULL,
    TX_USER varchar(60)  NOT NULL,
    TX_HOST varchar(60)  NOT NULL,
    CREATED timestamp  NOT NULL,
    CONSTRAINT MR_COUPONS_pk PRIMARY KEY (MR_COUPONS_ID)
);

-- Table: MR_DELIVER
CREATE TABLE MR_DELIVER (
    MR_DELIVER_ID serial  NOT NULL,
    DATE_OPE date  NOT NULL,
    MR_OPERATION_STATE_ID int  NOT NULL,
    MR_ADDRESS_ID int  NOT NULL,
    MR_USER_ID int  NOT NULL,
    MR_SCHEDULE_ID int  NOT NULL,
    MR_ORDER_ID int  NOT NULL,
    CODE_GEN varchar(256)  NOT NULL,
    STATUS smallint  NOT NULL,
    TX_DATE timestamp  NOT NULL,
    TX_USER varchar(60)  NOT NULL,
    TX_HOST varchar(60)  NOT NULL,
    CREATED timestamp  NOT NULL,
    CONSTRAINT MR_DELIVER_pk PRIMARY KEY (MR_DELIVER_ID)
);

-- Table: MR_DELIVER_HIST
CREATE TABLE MR_DELIVER_HIST (
    MR_DELIVER_HIST_ID int  NOT NULL,
    MR_DELIVER_ID int  NOT NULL,
    MR_OPERATION_STATE_ID int  NOT NULL,
    MOMENT timestamp  NOT NULL,
    CONSTRAINT MR_DELIVER_HIST_pk PRIMARY KEY (MR_DELIVER_HIST_ID)
);

-- Table: MR_GROUP
CREATE TABLE MR_GROUP (
    MR_GROUP_ID serial  NOT NULL,
    DETAIL varchar(200)  NOT NULL,
    CAT_GROUP varchar(50)  NOT NULL,
    STATUS smallint  NOT NULL,
    TX_DATE timestamp  NOT NULL,
    TX_USER varchar(50)  NOT NULL,
    TX_HOST varchar(50)  NOT NULL,
    CREATED timestamp  NOT NULL,
    CONSTRAINT MR_GROUP_pk PRIMARY KEY (MR_GROUP_ID)
);

-- Table: MR_GROUP_ROLE
CREATE TABLE MR_GROUP_ROLE (
    MR_GROUP_ROLE serial  NOT NULL,
    MR_GROUP_ID int  NOT NULL,
    MR_ROLE_ID int  NOT NULL,
    STATUS smallint  NOT NULL,
    TX_DATE timestamp  NOT NULL,
    TX_USER varchar(50)  NOT NULL,
    TX_HOST varchar(50)  NOT NULL,
    CREATED timestamp  NOT NULL,
    CONSTRAINT MR_GROUP_ROLE_pk PRIMARY KEY (MR_GROUP_ROLE)
);

-- Table: MR_HOLIDAYS
CREATE TABLE MR_HOLIDAYS (
    MR_HOLIDAYS_ID serial  NOT NULL,
    DATE_HOLIDAY date  NOT NULL,
    DETAIL varchar(200)  NOT NULL,
    STATUS smallint  NOT NULL,
    TX_DATE timestamp  NOT NULL,
    TX_USER varchar(60)  NOT NULL,
    TX_HOST varchar(60)  NOT NULL,
    CREATED timestamp  NOT NULL,
    CONSTRAINT MR_HOLIDAYS_pk PRIMARY KEY (MR_HOLIDAYS_ID)
);

-- Table: MR_INVOICE
CREATE TABLE MR_INVOICE (
    MR_INVOICE_ID serial  NOT NULL,
    NAME varchar(100)  NOT NULL,
    NIT varchar(20)  NOT NULL,
    STATUS smallint  NOT NULL,
    TX_DATE timestamp  NOT NULL,
    TX_USER varchar(60)  NOT NULL,
    TX_HOST varchar(60)  NOT NULL,
    CREATED timestamp  NOT NULL,
    CONSTRAINT MR_INVOICE_pk PRIMARY KEY (MR_INVOICE_ID)
);

-- Table: MR_INVOICE_USER
CREATE TABLE MR_INVOICE_USER (
    MR_INVOICE_USER_ID serial  NOT NULL,
    MR_INVOICE_ID int  NOT NULL,
    MR_USER_ID int  NOT NULL,
    STATUS int  NOT NULL,
    TX_DATE timestamp  NOT NULL,
    TX_USER varchar(60)  NOT NULL,
    TX_HOST varchar(60)  NOT NULL,
    CREATED timestamp  NOT NULL,
    CONSTRAINT MR_INVOICE_USER_pk PRIMARY KEY (MR_INVOICE_USER_ID)
);

-- Table: MR_OPERATION_STATE
CREATE TABLE MR_OPERATION_STATE (
    MR_OPERATION_STATE_ID serial  NOT NULL,
    STATE varchar(128)  NOT NULL,
    FOR_OPERATION varchar(64)  NOT NULL,
    DESCRIPTION_STATE varchar(256)  NOT NULL,
    SHOULD_SHOW smallint  NOT NULL,
    STATUS smallint  NOT NULL,
    TX_DATE timestamp  NOT NULL,
    TX_USER varchar(60)  NOT NULL,
    TX_HOST varchar(60)  NOT NULL,
    CREATED timestamp  NOT NULL,
    CONSTRAINT MR_OPERATION_STATE_pk PRIMARY KEY (MR_OPERATION_STATE_ID)
);

-- Table: MR_ORDER
CREATE TABLE MR_ORDER (
    MR_ORDER_ID serial  NOT NULL,
    COMMENT varchar(511)  NOT NULL,
    MR_COUPONS_ID int  NULL,
    MR_USER_ID int  NOT NULL,
    MR_OPERATION_STATE_ID int  NOT NULL,
    MR_PAYMENT_METHOD_ID int  NULL,
    PAY_CASH smallint  NOT NULL,
    MR_INVOICE_ID int  NULL,
    STATUS smallint  NOT NULL,
    TX_DATE timestamp  NOT NULL,
    TX_USER varchar(60)  NOT NULL,
    TX_HOST varchar(60)  NOT NULL,
    CREATED timestamp  NOT NULL,
    CONSTRAINT MR_ORDER_pk PRIMARY KEY (MR_ORDER_ID)
);

-- Table: MR_ORDER_HIST
CREATE TABLE MR_ORDER_HIST (
    MR_ORDER_HIST_ID serial  NOT NULL,
    MR_ORDER_ID int  NOT NULL,
    MR_OPERATION_STATE_ID int  NOT NULL,
    MOMENT timestamp  NOT NULL,
    CONSTRAINT MR_ORDER_HIST_pk PRIMARY KEY (MR_ORDER_HIST_ID)
);

-- Table: MR_PAYMENT_METHOD
CREATE TABLE MR_PAYMENT_METHOD (
    MR_PAYMENT_METHOD_ID serial  NOT NULL,
    NAME varchar(50)  NOT NULL,
    LAST_NUMBERS int  NOT NULL,
    CAD varchar(400)  NOT NULL,
    CVC2 varchar(400)  NOT NULL,
    NUMBER varchar(400)  NOT NULL,
    STATUS smallint  NOT NULL,
    TX_DATE timestamp  NOT NULL,
    TX_USER varchar(60)  NOT NULL,
    TX_HOST varchar(60)  NOT NULL,
    CREATED timestamp  NOT NULL,
    CONSTRAINT MR_PAYMENT_METHOD_pk PRIMARY KEY (MR_PAYMENT_METHOD_ID)
);

-- Table: MR_PAYMENT_METHOD_USER
CREATE TABLE MR_PAYMENT_METHOD_USER (
    MR_PAYMENT_METHOD_USER_ID serial  NOT NULL,
    MR_PAYMENT_METHOD_ID int  NOT NULL,
    MR_USER_ID int  NOT NULL,
    STATUS int  NOT NULL,
    TX_DATE timestamp  NOT NULL,
    TX_USER varchar(60)  NOT NULL,
    TX_HOST varchar(60)  NOT NULL,
    CREATED timestamp  NOT NULL,
    CONSTRAINT MR_PAYMENT_METHOD_USER_pk PRIMARY KEY (MR_PAYMENT_METHOD_USER_ID)
);

-- Table: MR_PERSON
CREATE TABLE MR_PERSON (
    MR_PERSON_ID serial  NOT NULL,
    FIRST_NAME varchar(50)  NOT NULL,
    LAST_NAME varchar(50)  NOT NULL,
    NUM_PHONE varchar(20)  NOT NULL,
    GENDER_PERSON int  NOT NULL,
    CAT_PER_STATUS varchar(50)  NOT NULL,
    STATUS smallint  NOT NULL,
    TX_DATE timestamp  NOT NULL,
    TX_USER varchar(50)  NOT NULL,
    TX_HOST varchar(50)  NOT NULL,
    CREATED timestamp  NOT NULL,
    CONSTRAINT MR_PERSON_pk PRIMARY KEY (MR_PERSON_ID)
);

-- Table: MR_PICKUP
CREATE TABLE MR_PICKUP (
    MR_PICKUP_ID serial  NOT NULL,
    DATE_OPE date  NOT NULL,
    MR_OPERATION_STATE_ID int  NOT NULL,
    MR_ADDRESS_ID int  NOT NULL,
    MR_USER_ID int  NOT NULL,
    MR_SCHEDULE_ID int  NOT NULL,
    MR_ORDER_ID int  NOT NULL,
    CODE_GEN varchar(256)  NOT NULL,
    TIMESTAMP_PLANED timestamp NOT NULL,
    STATUS smallint  NOT NULL,
    TX_DATE timestamp  NOT NULL,
    TX_USER varchar(60)  NOT NULL,
    TX_HOST varchar(60)  NOT NULL,
    CREATED timestamp  NOT NULL,
    CONSTRAINT MR_PICKUP_pk PRIMARY KEY (MR_PICKUP_ID)
);

-- Table: MR_PICKUP_HIST
CREATE TABLE MR_PICKUP_HIST (
    MR_PICKUP_HIST_ID serial  NOT NULL,
    MR_PICKUP_ID int  NOT NULL,
    MR_OPERATION_STATE_ID int  NOT NULL,
    MOMENT timestamp  NOT NULL,
    CONSTRAINT MR_PICKUP_HIST_pk PRIMARY KEY (MR_PICKUP_HIST_ID)
);

-- Table: MR_ROLE
CREATE TABLE MR_ROLE (
    MR_ROLE_ID serial  NOT NULL,
    DETAIL varchar(200)  NOT NULL,
    CAT_ROLE varchar(50)  NOT NULL,
    STATUS smallint  NOT NULL,
    TX_DATE timestamp  NOT NULL,
    TX_USER varchar(50)  NOT NULL,
    TX_HOST varchar(50)  NOT NULL,
    CREATED timestamp  NOT NULL,
    CONSTRAINT MR_ROLE_pk PRIMARY KEY (MR_ROLE_ID)
);

-- Table: MR_SCHEDULE
CREATE TABLE MR_SCHEDULE (
    MR_SCHEDULE_ID serial  NOT NULL,
    TIME_START time  NOT NULL,
    TIME_END time  NOT NULL,
    DETAIL varchar(200)  NOT NULL,
    STATUS smallint  NOT NULL,
    TX_DATE timestamp  NOT NULL,
    TX_USER varchar(60)  NOT NULL,
    TX_HOST varchar(60)  NOT NULL,
    CREATED timestamp  NOT NULL,
    CONSTRAINT MR_SCHEDULE_pk PRIMARY KEY (MR_SCHEDULE_ID)
);

-- Table: MR_SERVICE
CREATE TABLE MR_SERVICE (
    MR_SERVICE_ID serial  NOT NULL,
    PRICE decimal(10,2)  NOT NULL,
    CAT_SER_STATUS varchar(50)  NOT NULL,
    MR_SERVICE_DETAIL_ID int  NOT NULL,
    MR_CLOTHING_ID int  NOT NULL,
    PRINCIPAL_SERVICE smallint  NOT NULL,
    MR_SIZE_ID int  NOT NULL,
    STATUS smallint  NOT NULL,
    TX_DATE timestamp  NOT NULL,
    TX_USER varchar(50)  NOT NULL,
    TX_HOST varchar(50)  NOT NULL,
    CREATED timestamp  NOT NULL,
    CONSTRAINT MR_SERVICE_pk PRIMARY KEY (MR_SERVICE_ID)
);

-- Table: MR_SERVICE_DETAIL
CREATE TABLE MR_SERVICE_DETAIL (
    MR_SERVICE_DETAIL_ID serial  NOT NULL,
    TITLE varchar(100)  NOT NULL,
    DESCRIPTION varchar(400)  NOT NULL,
    STATUS smallint  NOT NULL,
    TX_DATE timestamp  NOT NULL,
    TX_USER varchar(50)  NOT NULL,
    TX_HOST varchar(50)  NOT NULL,
    CREATED timestamp  NOT NULL,
    CONSTRAINT MR_SERVICE_DETAIL_pk PRIMARY KEY (MR_SERVICE_DETAIL_ID)
);

-- Table: MR_SIZE
CREATE TABLE MR_SIZE (
    MR_SIZE_ID serial  NOT NULL,
    SIZE varchar(16)  NOT NULL,
    STATUS int  NOT NULL,
    TX_DATE timestamp  NOT NULL,
    TX_USER varchar(60)  NOT NULL,
    TX_HOST varchar(60)  NOT NULL,
    CREATED timestamp  NOT NULL,
    CONSTRAINT MR_SIZE_pk PRIMARY KEY (MR_SIZE_ID)
);

-- Table: MR_USER
CREATE TABLE MR_USER (
    MR_USER_ID serial  NOT NULL,
    USERNAME varchar(100)  NOT NULL,
    SECRET varchar(400)  NOT NULL,
    EMAIL varchar(254)  NOT NULL,
    CAT_USER_STATUS varchar(60)  NOT NULL,
    MR_PERSON_ID int  NOT NULL,
    STATUS smallint  NOT NULL,
    TX_DATE timestamp  NOT NULL,
    TX_USER varchar(50)  NOT NULL,
    TX_HOST varchar(50)  NOT NULL,
    CREATED timestamp  NOT NULL,
    CONSTRAINT MR_USER_pk PRIMARY KEY (MR_USER_ID)
);

-- Table: MR_USER_GROUP
CREATE TABLE MR_USER_GROUP (
    MR_USER_GROUP_ID serial  NOT NULL,
    MR_USER_ID int  NOT NULL,
    MR_GROUP_ID int  NOT NULL,
    STATUS smallint  NOT NULL,
    TX_DATE timestamp  NOT NULL,
    TX_USER varchar(50)  NOT NULL,
    TX_HOST varchar(50)  NOT NULL,
    CREATED timestamp  NOT NULL,
    CONSTRAINT MR_USER_GROUP_pk PRIMARY KEY (MR_USER_GROUP_ID)
);

-- End of file.

