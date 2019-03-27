# Micro-Services

In the process of designing a currency converter application, I have created 3 micro-services.
1. _Currency exchange service:_ Queries against the database and responds to the client when a request is posted.
2. _Currency conversion service:_ The request call is initiated here, this in turn sends the request to currency exchange service
3. _Configuration service:_ This service has all the configurations of the above 2 applications.

# Tech Stack Used in Micro-Services:

Spring Cloud
Feign