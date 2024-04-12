### Module Graph

```mermaid
%%{
  init: {
    'theme': 'neutral'
  }
}%%

graph LR
  subgraph order-service
    order-application
    order-container
    order-dataaccess
    order-messaging
  end
  subgraph order-domain
    order-application-service
    order-domain-core
  end
  order-container --> order-application
  order-container --> order-dataaccess
  order-container --> order-messaging
  order-container --> order-application-service
  order-container --> order-domain-core
  order-dataaccess --> order-application-service
  order-application-service --> order-domain-core
  order-application --> order-application-service
  order-messaging --> order-application-service
```
# Food ordering system