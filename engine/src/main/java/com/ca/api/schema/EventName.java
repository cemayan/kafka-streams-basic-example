/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ca.api.schema;
@org.apache.avro.specific.AvroGenerated
public enum EventName implements org.apache.avro.generic.GenericEnumSymbol<EventName> {
  MARKET_OPENED, GEM_PURCHASED  ;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"enum\",\"name\":\"EventName\",\"namespace\":\"com.ca.api.schema\",\"symbols\":[\"MARKET_OPENED\",\"GEM_PURCHASED\"]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
}
