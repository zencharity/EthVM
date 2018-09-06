/**
 * Autogenerated by Avro
 * <p>
 * DO NOT EDIT DIRECTLY
 */
package io.enkrypt.bolt.models;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Transfer extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -5488701600023039448L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Transfer\",\"namespace\":\"io.enkrypt.bolt.models\",\"fields\":[{\"name\":\"op\",\"type\":\"string\",\"doc\":\"Type of op executed inside the transaction\"},{\"name\":\"from\",\"type\":\"string\",\"doc\":\"\"},{\"name\":\"to\",\"type\":\"string\",\"doc\":\"\"},{\"name\":\"input\",\"type\":\"bytes\",\"doc\":\"\"}]}");

  public static org.apache.avro.Schema getClassSchema() {
    return SCHEMA$;
  }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Transfer> ENCODER =
    new BinaryMessageEncoder<Transfer>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Transfer> DECODER =
    new BinaryMessageDecoder<Transfer>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<Transfer> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<Transfer> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Transfer>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this Transfer to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a Transfer from a ByteBuffer. */
  public static Transfer fromByteBuffer(
    java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** Type of op executed inside the transaction */
  @Deprecated
  public CharSequence op;
  /**  */
  @Deprecated
  public CharSequence from;
  /**  */
  @Deprecated
  public CharSequence to;
  /**  */
  @Deprecated
  public java.nio.ByteBuffer input;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Transfer() {
  }

  /**
   * All-args constructor.
   * @param op Type of op executed inside the transaction
   * @param from
   * @param to
   * @param input
   */
  public Transfer(CharSequence op, CharSequence from, CharSequence to, java.nio.ByteBuffer input) {
    this.op = op;
    this.from = from;
    this.to = to;
    this.input = input;
  }

  public org.apache.avro.Schema getSchema() {
    return SCHEMA$;
  }

  // Used by DatumWriter.  Applications should not call.
  public Object get(int field$) {
    switch (field$) {
      case 0:
        return op;
      case 1:
        return from;
      case 2:
        return to;
      case 3:
        return input;
      default:
        throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value = "unchecked")
  public void put(int field$, Object value$) {
    switch (field$) {
      case 0:
        op = (CharSequence) value$;
        break;
      case 1:
        from = (CharSequence) value$;
        break;
      case 2:
        to = (CharSequence) value$;
        break;
      case 3:
        input = (java.nio.ByteBuffer) value$;
        break;
      default:
        throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'op' field.
   * @return Type of op executed inside the transaction
   */
  public CharSequence getOp() {
    return op;
  }

  /**
   * Sets the value of the 'op' field.
   * Type of op executed inside the transaction
   * @param value the value to set.
   */
  public void setOp(CharSequence value) {
    this.op = value;
  }

  /**
   * Gets the value of the 'from' field.
   * @return
   */
  public CharSequence getFrom() {
    return from;
  }

  /**
   * Sets the value of the 'from' field.
   *
   * @param value the value to set.
   */
  public void setFrom(CharSequence value) {
    this.from = value;
  }

  /**
   * Gets the value of the 'to' field.
   * @return
   */
  public CharSequence getTo() {
    return to;
  }

  /**
   * Sets the value of the 'to' field.
   *
   * @param value the value to set.
   */
  public void setTo(CharSequence value) {
    this.to = value;
  }

  /**
   * Gets the value of the 'input' field.
   * @return
   */
  public java.nio.ByteBuffer getInput() {
    return input;
  }

  /**
   * Sets the value of the 'input' field.
   *
   * @param value the value to set.
   */
  public void setInput(java.nio.ByteBuffer value) {
    this.input = value;
  }

  /**
   * Creates a new Transfer RecordBuilder.
   * @return A new Transfer RecordBuilder
   */
  public static Builder newBuilder() {
    return new Builder();
  }

  /**
   * Creates a new Transfer RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Transfer RecordBuilder
   */
  public static Builder newBuilder(Builder other) {
    return new Builder(other);
  }

  /**
   * Creates a new Transfer RecordBuilder by copying an existing Transfer instance.
   * @param other The existing instance to copy.
   * @return A new Transfer RecordBuilder
   */
  public static Builder newBuilder(Transfer other) {
    return new Builder(other);
  }

  /**
   * RecordBuilder for Transfer instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Transfer>
    implements org.apache.avro.data.RecordBuilder<Transfer> {

    /** Type of op executed inside the transaction */
    private CharSequence op;
    /**  */
    private CharSequence from;
    /**  */
    private CharSequence to;
    /**  */
    private java.nio.ByteBuffer input;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.op)) {
        this.op = data().deepCopy(fields()[0].schema(), other.op);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.from)) {
        this.from = data().deepCopy(fields()[1].schema(), other.from);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.to)) {
        this.to = data().deepCopy(fields()[2].schema(), other.to);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.input)) {
        this.input = data().deepCopy(fields()[3].schema(), other.input);
        fieldSetFlags()[3] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Transfer instance
     * @param other The existing instance to copy.
     */
    private Builder(Transfer other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.op)) {
        this.op = data().deepCopy(fields()[0].schema(), other.op);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.from)) {
        this.from = data().deepCopy(fields()[1].schema(), other.from);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.to)) {
        this.to = data().deepCopy(fields()[2].schema(), other.to);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.input)) {
        this.input = data().deepCopy(fields()[3].schema(), other.input);
        fieldSetFlags()[3] = true;
      }
    }

    /**
     * Gets the value of the 'op' field.
     * Type of op executed inside the transaction
     * @return The value.
     */
    public CharSequence getOp() {
      return op;
    }

    /**
     * Sets the value of the 'op' field.
     * Type of op executed inside the transaction
     * @param value The value of 'op'.
     * @return This builder.
     */
    public Builder setOp(CharSequence value) {
      validate(fields()[0], value);
      this.op = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
     * Checks whether the 'op' field has been set.
     * Type of op executed inside the transaction
     * @return True if the 'op' field has been set, false otherwise.
     */
    public boolean hasOp() {
      return fieldSetFlags()[0];
    }


    /**
     * Clears the value of the 'op' field.
     * Type of op executed inside the transaction
     * @return This builder.
     */
    public Builder clearOp() {
      op = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
     * Gets the value of the 'from' field.
     *
     * @return The value.
     */
    public CharSequence getFrom() {
      return from;
    }

    /**
     * Sets the value of the 'from' field.
     *
     * @param value The value of 'from'.
     * @return This builder.
     */
    public Builder setFrom(CharSequence value) {
      validate(fields()[1], value);
      this.from = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
     * Checks whether the 'from' field has been set.
     *
     * @return True if the 'from' field has been set, false otherwise.
     */
    public boolean hasFrom() {
      return fieldSetFlags()[1];
    }


    /**
     * Clears the value of the 'from' field.
     *
     * @return This builder.
     */
    public Builder clearFrom() {
      from = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
     * Gets the value of the 'to' field.
     *
     * @return The value.
     */
    public CharSequence getTo() {
      return to;
    }

    /**
     * Sets the value of the 'to' field.
     *
     * @param value The value of 'to'.
     * @return This builder.
     */
    public Builder setTo(CharSequence value) {
      validate(fields()[2], value);
      this.to = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
     * Checks whether the 'to' field has been set.
     *
     * @return True if the 'to' field has been set, false otherwise.
     */
    public boolean hasTo() {
      return fieldSetFlags()[2];
    }


    /**
     * Clears the value of the 'to' field.
     *
     * @return This builder.
     */
    public Builder clearTo() {
      to = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
     * Gets the value of the 'input' field.
     *
     * @return The value.
     */
    public java.nio.ByteBuffer getInput() {
      return input;
    }

    /**
     * Sets the value of the 'input' field.
     *
     * @param value The value of 'input'.
     * @return This builder.
     */
    public Builder setInput(java.nio.ByteBuffer value) {
      validate(fields()[3], value);
      this.input = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
     * Checks whether the 'input' field has been set.
     *
     * @return True if the 'input' field has been set, false otherwise.
     */
    public boolean hasInput() {
      return fieldSetFlags()[3];
    }


    /**
     * Clears the value of the 'input' field.
     *
     * @return This builder.
     */
    public Builder clearInput() {
      input = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Transfer build() {
      try {
        Transfer record = new Transfer();
        record.op = fieldSetFlags()[0] ? this.op : (CharSequence) defaultValue(fields()[0]);
        record.from = fieldSetFlags()[1] ? this.from : (CharSequence) defaultValue(fields()[1]);
        record.to = fieldSetFlags()[2] ? this.to : (CharSequence) defaultValue(fields()[2]);
        record.input = fieldSetFlags()[3] ? this.input : (java.nio.ByteBuffer) defaultValue(fields()[3]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Transfer>
    WRITER$ = (org.apache.avro.io.DatumWriter<Transfer>) MODEL$.createDatumWriter(SCHEMA$);

  @Override
  public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Transfer>
    READER$ = (org.apache.avro.io.DatumReader<Transfer>) MODEL$.createDatumReader(SCHEMA$);

  @Override
  public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
