  **Spring Security With Oauth 2**
 =============

**1) O Auth2 server Information**
 ```
    - Server port = 8001

    - Default user = vengat(USER),vijayan(USER,ADMIN)

    - Password     = 123, 12345
    
    - Client_Id    = developer

    - secret code  = gamerz 
 ```

 **To Access the Token through POSTMAN**


###### 1) To Enter the followsing Url to access token 

> localhost:8001/service/oauth/token

> method = POST
 
--------------

 ###### 2) Set the Authorization 

 > type = Basic Auth (username= "developer" & password= "gamer")

 ![authorization](https://raw.githubusercontent.com/vengatesanns/Games/master/authorization.jpg)
 
--------------

 ###### 3) Set the content in Body 

 ```
    - grant_type = password

    - client_id  = developer

    - username   = vengat
    
    - password   = 123
 ```


   ![Body](https://raw.githubusercontent.com/vengatesanns/Games/master/body.jpg)

--------------

 ###### 4) Finally click on the send button to get the access token
 
 ```
 like this...

 {
    "access_token": "80e442aa-ca85-4a8f-8aab-18f72b433177",

    "token_type": "bearer",

    "refresh_token": "807bdb56-26d1-40cc-990e-d5c09e54a733",

    "expires_in": 43199,

    "scope": "read write"
}
 ```

 ![token](https://raw.githubusercontent.com/vengatesanns/Games/master/Token.jpg)
  
  --------------



