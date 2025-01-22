/*
  Template pattern - [Behavioural pattern]

  The Chain of responsability is a series of handler objets that are linked to-
  gether.

  Each handler is in charge to serve an specific request. each handler pass
  down a request in to the chain if he is not in charge of serving that
  request

  The logic goes as this:

    check if rule matches (the request matches the current stage requirements)
    if it matches, do something
    if it doesnt match, call the next filter in the list

  You can mix this pattern with the template pattern.

  The goal of this pattern is to avoid the coupling of the sender to the receiver
  by giving more than one object the chance to handle the request. Who sends the
  request does not care who handles the request
*/

// no code for this one
