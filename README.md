### Real-time Examples for Kafka Streams

### Introduction

![kafka-logo.png](image/kafka-logo.png)

This app has two components.
- API
- Engine

#### API
API project send  Events to Kafka with KafkaTemplate.
(For Real world app simulation)

#### Engine
This project consume the event which is written the topic.
Also, it provides the rule creation. In this way, we could write  our rules.

---

### API Usage

In order to sendEvent to Kafka:
(**api-project**)

Example :
> **/POST**  api/v1/sendEvent
```json
{
  "eventName":0,
  "userId": "77",
  "eventData": {
    "var1": "131"
  }
}
```


In order to saveRule:
(**engine-project**)

Example :
> **/POST**  api/v1/engine/saveRule
```json
{
  "ruleName": "Rule1",
  "eventName": 0,
  "config" : {
    "aggregatorMethod": 0,
    "condition": 0,
    "conditionValue": 2,
    "timeSelector": 0
  }
}
```


Then we can combine the rules:
(**engine-project**)

Example:
> **/POST**  api/v1/engine/saveRuleManagement

```json
{
  "rule1": 0,
  "rule2": 1,
  "logicOperator": 0,
  "status": true
}
```



---

### Zookeeper-Kafka-Schema Registry

> If you don't have kafka, zookeeper and schema registry. You should install it.

You can run the commands like below code for start to kafka,zookeeper and schema registry.

```bash
zookeeper-server-start.sh $KAFKA_HOME/config/zookeeper.properties
```


```bash
kafka-server-start.sh $KAFKA_HOME/config/server.properties
```

```bash
 schema-registry-start $CONFLUENT_HOME/etc/schema-registry/schema-registry.properties
 ```

