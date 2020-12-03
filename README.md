# dl-backend-technical-interview 
This exercise is to see how you go about executing a relatively simple set of use cases 
in which you need to create a Ktor based Kotlin microservice that utilizes multiple sources 
of data in order to expose a simple RESTful JSON API.    

## Setup
- clone this git repository as this will form be the base of your service

## Exercise Detail
- you will need to create the following fully functional RESTful endpoints: 
    - get a list of beers
    - add a beer
    - get a beer for a given ID
    - search all beers for a given name
    - get a random beer 
     
- Your data sources this needs to come from the following sources:
  -  [The Punk API](https://punkapi.com/documentation/v2)
      - this API requires no authentication 
  - the [local resource file](https://github.com/soenergy/dl-backend-technical-interview/blob/main/resources/so-energy-beers.json)
  - consumers of your own API! (via your own endpoint to add a beer)

- you are free to add whatever libraries you like to complete the task at hand

- the JSON definition of a beer that your service should be using for your various 
  endpoints [can be found within the resources](https://github.com/soenergy/dl-backend-technical-interview/blob/main/resources/beer-example/beer-example.json)  

## Notes

- The intention is for this test to take you no more than around ±3 hours or so depending on 
  your familiarity with the Kotlin language and/or the tool
  
- structure your commits
    - remember that the idea here is for us to be able to see how you go about tackling the problem, and a 
      commit that does one action is easier to follow than a commit that contains several actions      

- please note that **we do not expect a full on database design & implementation**
    - the emphasis here is on the code itself, it would be more than sufficient to have in-memory only implementations 
      of any persistence interfaces you might otherwise have ordinarily setup  

- Your resulting project is going to be judged largely on the following merits:
    - the design of the external facing API your service is exposing 
    - the design of your internal system architecture  
        - clean architectural principles
        - how you go about modeling the data that you consume vs the data you expose and mapping  
    - testing!
        - how testable your service is 
        - where you focus your testing efforts
        
- your service implementation will form the basis of our final stage interview

- should you have any questions, please don't hesitate to get in touch with us
