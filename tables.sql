TABLE  TABLE_USERS

USER_ID , USER_NAME , USER_PASSWORD ;



TABLE  TABLE_CLIENTS

CLIENT_USER_ID , CLIENT_USER_NAME , CLIENT_USER_PASSWORD , CLIENT_ADDRESS , CLIENT_PHONE_NO , CREATED_USER_ID , CREATED_DATE;





TABLE   TABLE_ACCOUNT_DETAILS

CLIENT_USER_ID , CLIENT_ACC_NO , IS_CHEQUING , IS_SAVING , ACC_BRANCH_ADDRESS , CREATED_DATE;




TABLE ACCOUNT_BALANCE_DETAILS

CLIENT_USER_ID , CLIENT_ACC_NO , CHEQUING_BALANCE , SAVING_BALANCE , LAST_UPDATED_DATE;




TABLE PENDING_DEPOSITS

CLIENT_USER_ID , CLIENT_ACC_NO , PENDING_DEPOSIT_AMOUNT , DEPOSITE_DATE;




TABLE WITHDRAW_DETAILS

CLIENT_USER_ID , CLIENT_ACC_NO , WITHDRAW_AMOUNT , WITHDRAW_DATE ;



TABLE TRANSACTION_DETAILS

CLIENT_USER_ID , CLIENT_ACC_NO , AMOUNT,  IS_DEBIT , IS_CREDIT , COMMENTS ,  TRANSACTION_DATE;



 

