##Sign-İn





    POST /api/authentication/sign-in HTTP/1.1
    Host: localhost:3333
    Content-Type: application/json
    Content-Length: 69


    {

       "username":"user",
       "password":"user"
    }

###make-admin 

___
    PUT /api/internal/make-admin/admin HTTP/1.1
    Host: localhost:3333
    Authorization: Bearer InternalApiKey1234!
    Content-Type: application/json
    Content-Length: 96
    
    {

        "name":"admin",
       "username":"admin",
       "password":"admin"
    }