/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ca.api.schema;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class Events extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -6526204933782199691L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Events\",\"namespace\":\"com.ca.api.schema\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"userId\",\"type\":\"string\"},{\"name\":\"eventName\",\"type\":{\"type\":\"enum\",\"name\":\"EventName\",\"symbols\":[\"MARKET_OPENED\",\"GEM_PURCHASED\"]}},{\"name\":\"eventDate\",\"type\":\"long\"},{\"name\":\"eventData\",\"type\":{\"type\":\"map\",\"values\":\"string\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Events> ENCODER =
      new BinaryMessageEncoder<Events>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Events> DECODER =
      new BinaryMessageDecoder<Events>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Events> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Events> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Events> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Events>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Events to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Events from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Events instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Events fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.CharSequence id;
   private java.lang.CharSequence userId;
   private com.ca.api.schema.EventName eventName;
   private long eventDate;
   private java.util.Map<java.lang.CharSequence,java.lang.CharSequence> eventData;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Events() {}

  /**
   * All-args constructor.
   * @param id The new value for id
   * @param userId The new value for userId
   * @param eventName The new value for eventName
   * @param eventDate The new value for eventDate
   * @param eventData The new value for eventData
   */
  public Events(java.lang.CharSequence id, java.lang.CharSequence userId, com.ca.api.schema.EventName eventName, java.lang.Long eventDate, java.util.Map<java.lang.CharSequence,java.lang.CharSequence> eventData) {
    this.id = id;
    this.userId = userId;
    this.eventName = eventName;
    this.eventDate = eventDate;
    this.eventData = eventData;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return userId;
    case 2: return eventName;
    case 3: return eventDate;
    case 4: return eventData;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.CharSequence)value$; break;
    case 1: userId = (java.lang.CharSequence)value$; break;
    case 2: eventName = (com.ca.api.schema.EventName)value$; break;
    case 3: eventDate = (java.lang.Long)value$; break;
    case 4: eventData = (java.util.Map<java.lang.CharSequence,java.lang.CharSequence>)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public java.lang.CharSequence getId() {
    return id;
  }


  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.CharSequence value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'userId' field.
   * @return The value of the 'userId' field.
   */
  public java.lang.CharSequence getUserId() {
    return userId;
  }


  /**
   * Sets the value of the 'userId' field.
   * @param value the value to set.
   */
  public void setUserId(java.lang.CharSequence value) {
    this.userId = value;
  }

  /**
   * Gets the value of the 'eventName' field.
   * @return The value of the 'eventName' field.
   */
  public com.ca.api.schema.EventName getEventName() {
    return eventName;
  }


  /**
   * Sets the value of the 'eventName' field.
   * @param value the value to set.
   */
  public void setEventName(com.ca.api.schema.EventName value) {
    this.eventName = value;
  }

  /**
   * Gets the value of the 'eventDate' field.
   * @return The value of the 'eventDate' field.
   */
  public long getEventDate() {
    return eventDate;
  }


  /**
   * Sets the value of the 'eventDate' field.
   * @param value the value to set.
   */
  public void setEventDate(long value) {
    this.eventDate = value;
  }

  /**
   * Gets the value of the 'eventData' field.
   * @return The value of the 'eventData' field.
   */
  public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> getEventData() {
    return eventData;
  }


  /**
   * Sets the value of the 'eventData' field.
   * @param value the value to set.
   */
  public void setEventData(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> value) {
    this.eventData = value;
  }

  /**
   * Creates a new Events RecordBuilder.
   * @return A new Events RecordBuilder
   */
  public static com.ca.api.schema.Events.Builder newBuilder() {
    return new com.ca.api.schema.Events.Builder();
  }

  /**
   * Creates a new Events RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Events RecordBuilder
   */
  public static com.ca.api.schema.Events.Builder newBuilder(com.ca.api.schema.Events.Builder other) {
    if (other == null) {
      return new com.ca.api.schema.Events.Builder();
    } else {
      return new com.ca.api.schema.Events.Builder(other);
    }
  }

  /**
   * Creates a new Events RecordBuilder by copying an existing Events instance.
   * @param other The existing instance to copy.
   * @return A new Events RecordBuilder
   */
  public static com.ca.api.schema.Events.Builder newBuilder(com.ca.api.schema.Events other) {
    if (other == null) {
      return new com.ca.api.schema.Events.Builder();
    } else {
      return new com.ca.api.schema.Events.Builder(other);
    }
  }

  /**
   * RecordBuilder for Events instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Events>
    implements org.apache.avro.data.RecordBuilder<Events> {

    private java.lang.CharSequence id;
    private java.lang.CharSequence userId;
    private com.ca.api.schema.EventName eventName;
    private long eventDate;
    private java.util.Map<java.lang.CharSequence,java.lang.CharSequence> eventData;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.ca.api.schema.Events.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.userId)) {
        this.userId = data().deepCopy(fields()[1].schema(), other.userId);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.eventName)) {
        this.eventName = data().deepCopy(fields()[2].schema(), other.eventName);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.eventDate)) {
        this.eventDate = data().deepCopy(fields()[3].schema(), other.eventDate);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.eventData)) {
        this.eventData = data().deepCopy(fields()[4].schema(), other.eventData);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
    }

    /**
     * Creates a Builder by copying an existing Events instance
     * @param other The existing instance to copy.
     */
    private Builder(com.ca.api.schema.Events other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.userId)) {
        this.userId = data().deepCopy(fields()[1].schema(), other.userId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.eventName)) {
        this.eventName = data().deepCopy(fields()[2].schema(), other.eventName);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.eventDate)) {
        this.eventDate = data().deepCopy(fields()[3].schema(), other.eventDate);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.eventData)) {
        this.eventData = data().deepCopy(fields()[4].schema(), other.eventData);
        fieldSetFlags()[4] = true;
      }
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public java.lang.CharSequence getId() {
      return id;
    }


    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public com.ca.api.schema.Events.Builder setId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public com.ca.api.schema.Events.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'userId' field.
      * @return The value.
      */
    public java.lang.CharSequence getUserId() {
      return userId;
    }


    /**
      * Sets the value of the 'userId' field.
      * @param value The value of 'userId'.
      * @return This builder.
      */
    public com.ca.api.schema.Events.Builder setUserId(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.userId = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'userId' field has been set.
      * @return True if the 'userId' field has been set, false otherwise.
      */
    public boolean hasUserId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'userId' field.
      * @return This builder.
      */
    public com.ca.api.schema.Events.Builder clearUserId() {
      userId = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'eventName' field.
      * @return The value.
      */
    public com.ca.api.schema.EventName getEventName() {
      return eventName;
    }


    /**
      * Sets the value of the 'eventName' field.
      * @param value The value of 'eventName'.
      * @return This builder.
      */
    public com.ca.api.schema.Events.Builder setEventName(com.ca.api.schema.EventName value) {
      validate(fields()[2], value);
      this.eventName = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'eventName' field has been set.
      * @return True if the 'eventName' field has been set, false otherwise.
      */
    public boolean hasEventName() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'eventName' field.
      * @return This builder.
      */
    public com.ca.api.schema.Events.Builder clearEventName() {
      eventName = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'eventDate' field.
      * @return The value.
      */
    public long getEventDate() {
      return eventDate;
    }


    /**
      * Sets the value of the 'eventDate' field.
      * @param value The value of 'eventDate'.
      * @return This builder.
      */
    public com.ca.api.schema.Events.Builder setEventDate(long value) {
      validate(fields()[3], value);
      this.eventDate = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'eventDate' field has been set.
      * @return True if the 'eventDate' field has been set, false otherwise.
      */
    public boolean hasEventDate() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'eventDate' field.
      * @return This builder.
      */
    public com.ca.api.schema.Events.Builder clearEventDate() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'eventData' field.
      * @return The value.
      */
    public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> getEventData() {
      return eventData;
    }


    /**
      * Sets the value of the 'eventData' field.
      * @param value The value of 'eventData'.
      * @return This builder.
      */
    public com.ca.api.schema.Events.Builder setEventData(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> value) {
      validate(fields()[4], value);
      this.eventData = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'eventData' field has been set.
      * @return True if the 'eventData' field has been set, false otherwise.
      */
    public boolean hasEventData() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'eventData' field.
      * @return This builder.
      */
    public com.ca.api.schema.Events.Builder clearEventData() {
      eventData = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Events build() {
      try {
        Events record = new Events();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.userId = fieldSetFlags()[1] ? this.userId : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.eventName = fieldSetFlags()[2] ? this.eventName : (com.ca.api.schema.EventName) defaultValue(fields()[2]);
        record.eventDate = fieldSetFlags()[3] ? this.eventDate : (java.lang.Long) defaultValue(fields()[3]);
        record.eventData = fieldSetFlags()[4] ? this.eventData : (java.util.Map<java.lang.CharSequence,java.lang.CharSequence>) defaultValue(fields()[4]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Events>
    WRITER$ = (org.apache.avro.io.DatumWriter<Events>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Events>
    READER$ = (org.apache.avro.io.DatumReader<Events>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.id);

    out.writeString(this.userId);

    out.writeEnum(this.eventName.ordinal());

    out.writeLong(this.eventDate);

    long size0 = this.eventData.size();
    out.writeMapStart();
    out.setItemCount(size0);
    long actualSize0 = 0;
    for (java.util.Map.Entry<java.lang.CharSequence, java.lang.CharSequence> e0: this.eventData.entrySet()) {
      actualSize0++;
      out.startItem();
      out.writeString(e0.getKey());
      java.lang.CharSequence v0 = e0.getValue();
      out.writeString(v0);
    }
    out.writeMapEnd();
    if (actualSize0 != size0)
      throw new java.util.ConcurrentModificationException("Map-size written was " + size0 + ", but element count was " + actualSize0 + ".");

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.id = in.readString(this.id instanceof Utf8 ? (Utf8)this.id : null);

      this.userId = in.readString(this.userId instanceof Utf8 ? (Utf8)this.userId : null);

      this.eventName = com.ca.api.schema.EventName.values()[in.readEnum()];

      this.eventDate = in.readLong();

      long size0 = in.readMapStart();
      java.util.Map<java.lang.CharSequence,java.lang.CharSequence> m0 = this.eventData; // Need fresh name due to limitation of macro system
      if (m0 == null) {
        m0 = new java.util.HashMap<java.lang.CharSequence,java.lang.CharSequence>((int)size0);
        this.eventData = m0;
      } else m0.clear();
      for ( ; 0 < size0; size0 = in.mapNext()) {
        for ( ; size0 != 0; size0--) {
          java.lang.CharSequence k0 = null;
          k0 = in.readString(k0 instanceof Utf8 ? (Utf8)k0 : null);
          java.lang.CharSequence v0 = null;
          v0 = in.readString(v0 instanceof Utf8 ? (Utf8)v0 : null);
          m0.put(k0, v0);
        }
      }

    } else {
      for (int i = 0; i < 5; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.id = in.readString(this.id instanceof Utf8 ? (Utf8)this.id : null);
          break;

        case 1:
          this.userId = in.readString(this.userId instanceof Utf8 ? (Utf8)this.userId : null);
          break;

        case 2:
          this.eventName = com.ca.api.schema.EventName.values()[in.readEnum()];
          break;

        case 3:
          this.eventDate = in.readLong();
          break;

        case 4:
          long size0 = in.readMapStart();
          java.util.Map<java.lang.CharSequence,java.lang.CharSequence> m0 = this.eventData; // Need fresh name due to limitation of macro system
          if (m0 == null) {
            m0 = new java.util.HashMap<java.lang.CharSequence,java.lang.CharSequence>((int)size0);
            this.eventData = m0;
          } else m0.clear();
          for ( ; 0 < size0; size0 = in.mapNext()) {
            for ( ; size0 != 0; size0--) {
              java.lang.CharSequence k0 = null;
              k0 = in.readString(k0 instanceof Utf8 ? (Utf8)k0 : null);
              java.lang.CharSequence v0 = null;
              v0 = in.readString(v0 instanceof Utf8 ? (Utf8)v0 : null);
              m0.put(k0, v0);
            }
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










