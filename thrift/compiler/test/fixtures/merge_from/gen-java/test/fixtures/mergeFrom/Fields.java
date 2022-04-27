/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

package test.fixtures.mergeFrom;

import com.facebook.swift.codec.*;
import com.facebook.swift.codec.ThriftField.Requiredness;
import com.facebook.swift.codec.ThriftField.Recursiveness;
import com.google.common.collect.*;
import java.util.*;
import javax.annotation.Nullable;
import org.apache.thrift.*;
import org.apache.thrift.transport.*;
import org.apache.thrift.protocol.*;
import static com.google.common.base.MoreObjects.toStringHelper;
import static com.google.common.base.MoreObjects.ToStringHelper;

@SwiftGenerated
@com.facebook.swift.codec.ThriftStruct(value="Fields", builder=Fields.Builder.class)
public final class Fields implements com.facebook.thrift.payload.ThriftSerializable {

    @ThriftConstructor
    public Fields(
        @com.facebook.swift.codec.ThriftField(value=100, name="injected_field", requiredness=Requiredness.NONE) final String injectedField
    ) {
        this.injectedField = injectedField;
    }
    
    @ThriftConstructor
    protected Fields() {
      this.injectedField = null;
    }
    
    public static class Builder {
    
        private String injectedField = null;
    
        @com.facebook.swift.codec.ThriftField(value=100, name="injected_field", requiredness=Requiredness.NONE)
        public Builder setInjectedField(String injectedField) {
            this.injectedField = injectedField;
            return this;
        }
    
        public String getInjectedField() { return injectedField; }
    
        public Builder() { }
        public Builder(Fields other) {
            this.injectedField = other.injectedField;
        }
    
        @ThriftConstructor
        public Fields build() {
            Fields result = new Fields (
                this.injectedField
            );
            return result;
        }
    }
        public static final Map<String, Integer> NAMES_TO_IDS = new HashMap();
    public static final Map<String, Integer> THRIFT_NAMES_TO_IDS = new HashMap();
    public static final Map<Integer, TField> FIELD_METADATA = new HashMap<>();
    private static final TStruct STRUCT_DESC = new TStruct("Fields");
    private final String injectedField;
    public static final int _INJECTED_FIELD = 100;
    private static final TField INJECTED_FIELD_FIELD_DESC = new TField("injected_field", TType.STRING, (short)100);
    static {
      NAMES_TO_IDS.put("injectedField", 100);
      THRIFT_NAMES_TO_IDS.put("injected_field", 100);
      FIELD_METADATA.put(100, INJECTED_FIELD_FIELD_DESC);
    }
    
    @Nullable
    @com.facebook.swift.codec.ThriftField(value=100, name="injected_field", requiredness=Requiredness.NONE)
    public String getInjectedField() { return injectedField; }
    
    @java.lang.Override
    public String toString() {
        ToStringHelper helper = toStringHelper(this);
        helper.add("injectedField", injectedField);
        return helper.toString();
    }
    
    @java.lang.Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
    
        Fields other = (Fields)o;
    
        return
            Objects.equals(injectedField, other.injectedField) &&
            true;
    }
    
    @java.lang.Override
    public int hashCode() {
        return Arrays.deepHashCode(new Object[] {
            injectedField
        });
    }
    
    
    public static com.facebook.thrift.payload.Reader<Fields> asReader() {
      return Fields::read0;
    }
    
    public static Fields read0(TProtocol oprot) throws TException {
      TField __field;
      oprot.readStructBegin(Fields.NAMES_TO_IDS, Fields.THRIFT_NAMES_TO_IDS, Fields.FIELD_METADATA);
      Fields.Builder builder = new Fields.Builder();
      while (true) {
        __field = oprot.readFieldBegin();
        if (__field.type == TType.STOP) { break; }
        switch (__field.id) {
        case _INJECTED_FIELD:
          if (__field.type == TType.STRING) {
            String injectedField = oprot.readString();
            builder.setInjectedField(injectedField);
          } else {
            TProtocolUtil.skip(oprot, __field.type);
          }
          break;
        default:
          TProtocolUtil.skip(oprot, __field.type);
          break;
        }
        oprot.readFieldEnd();
      }
      oprot.readStructEnd();
      return builder.build();
    }
    
    public void write0(TProtocol oprot) throws TException {
      oprot.writeStructBegin(STRUCT_DESC);
      if (this.injectedField != null) {
        oprot.writeFieldBegin(INJECTED_FIELD_FIELD_DESC);
        oprot.writeString(this.injectedField);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
    private static class _FieldsLazy {
        private static final Fields _DEFAULT = new Fields.Builder().build();
    }
    
    public static Fields defaultInstance() {
        return  _FieldsLazy._DEFAULT;
    }
}
