/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

package test.fixtures.patch;

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
@com.facebook.swift.codec.ThriftStruct(value="MyDataFieldPatch", builder=MyDataFieldPatch.Builder.class)
public final class MyDataFieldPatch implements com.facebook.thrift.payload.ThriftSerializable {

    @ThriftConstructor
    public MyDataFieldPatch(
        @com.facebook.swift.codec.ThriftField(value=1, name="data1", requiredness=Requiredness.NONE) final com.facebook.thrift.op.StringPatch data1,
        @com.facebook.swift.codec.ThriftField(value=2, name="data2", requiredness=Requiredness.NONE) final com.facebook.thrift.op.I32Patch data2
    ) {
        this.data1 = data1;
        this.data2 = data2;
    }
    
    @ThriftConstructor
    protected MyDataFieldPatch() {
      this.data1 = null;
      this.data2 = null;
    }
    
    public static class Builder {
    
        private com.facebook.thrift.op.StringPatch data1 = null;
        private com.facebook.thrift.op.I32Patch data2 = null;
    
        @com.facebook.swift.codec.ThriftField(value=1, name="data1", requiredness=Requiredness.NONE)
        public Builder setData1(com.facebook.thrift.op.StringPatch data1) {
            this.data1 = data1;
            return this;
        }
    
        public com.facebook.thrift.op.StringPatch getData1() { return data1; }
    
            @com.facebook.swift.codec.ThriftField(value=2, name="data2", requiredness=Requiredness.NONE)
        public Builder setData2(com.facebook.thrift.op.I32Patch data2) {
            this.data2 = data2;
            return this;
        }
    
        public com.facebook.thrift.op.I32Patch getData2() { return data2; }
    
        public Builder() { }
        public Builder(MyDataFieldPatch other) {
            this.data1 = other.data1;
            this.data2 = other.data2;
        }
    
        @ThriftConstructor
        public MyDataFieldPatch build() {
            MyDataFieldPatch result = new MyDataFieldPatch (
                this.data1,
                this.data2
            );
            return result;
        }
    }
            public static final Map<String, Integer> NAMES_TO_IDS = new HashMap();
    public static final Map<String, Integer> THRIFT_NAMES_TO_IDS = new HashMap();
    public static final Map<Integer, TField> FIELD_METADATA = new HashMap<>();
    private static final TStruct STRUCT_DESC = new TStruct("MyDataFieldPatch");
    private final com.facebook.thrift.op.StringPatch data1;
    public static final int _DATA1 = 1;
    private static final TField DATA1_FIELD_DESC = new TField("data1", TType.STRUCT, (short)1);
        private final com.facebook.thrift.op.I32Patch data2;
    public static final int _DATA2 = 2;
    private static final TField DATA2_FIELD_DESC = new TField("data2", TType.STRUCT, (short)2);
    static {
      NAMES_TO_IDS.put("data1", 1);
      THRIFT_NAMES_TO_IDS.put("data1", 1);
      FIELD_METADATA.put(1, DATA1_FIELD_DESC);
      NAMES_TO_IDS.put("data2", 2);
      THRIFT_NAMES_TO_IDS.put("data2", 2);
      FIELD_METADATA.put(2, DATA2_FIELD_DESC);
      com.facebook.thrift.type.TypeRegistry.add(new com.facebook.thrift.type.Type(
        new com.facebook.thrift.type.UniversalName("test.dev/fixtures/patch/MyDataFieldPatch"), 
        MyDataFieldPatch.class, MyDataFieldPatch::read0));
    }
    
    @Nullable
    @com.facebook.swift.codec.ThriftField(value=1, name="data1", requiredness=Requiredness.NONE)
    public com.facebook.thrift.op.StringPatch getData1() { return data1; }
    
    
    @Nullable
    @com.facebook.swift.codec.ThriftField(value=2, name="data2", requiredness=Requiredness.NONE)
    public com.facebook.thrift.op.I32Patch getData2() { return data2; }
    
    @java.lang.Override
    public String toString() {
        ToStringHelper helper = toStringHelper(this);
        helper.add("data1", data1);
        helper.add("data2", data2);
        return helper.toString();
    }
    
    @java.lang.Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
    
        MyDataFieldPatch other = (MyDataFieldPatch)o;
    
        return
            Objects.equals(data1, other.data1) &&
    Objects.equals(data2, other.data2) &&
            true;
    }
    
    @java.lang.Override
    public int hashCode() {
        return Arrays.deepHashCode(new java.lang.Object[] {
            data1,
            data2
        });
    }
    
    
    public static com.facebook.thrift.payload.Reader<MyDataFieldPatch> asReader() {
      return MyDataFieldPatch::read0;
    }
    
    public static MyDataFieldPatch read0(TProtocol oprot) throws TException {
      TField __field;
      oprot.readStructBegin(MyDataFieldPatch.NAMES_TO_IDS, MyDataFieldPatch.THRIFT_NAMES_TO_IDS, MyDataFieldPatch.FIELD_METADATA);
      MyDataFieldPatch.Builder builder = new MyDataFieldPatch.Builder();
      while (true) {
        __field = oprot.readFieldBegin();
        if (__field.type == TType.STOP) { break; }
        switch (__field.id) {
        case _DATA1:
          if (__field.type == TType.STRUCT) {
            com.facebook.thrift.op.StringPatch data1 = com.facebook.thrift.op.StringPatch.read0(oprot);
            builder.setData1(data1);
          } else {
            TProtocolUtil.skip(oprot, __field.type);
          }
          break;
        case _DATA2:
          if (__field.type == TType.STRUCT) {
            com.facebook.thrift.op.I32Patch data2 = com.facebook.thrift.op.I32Patch.read0(oprot);
            builder.setData2(data2);
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
      if (this.data1 != null) {
        oprot.writeFieldBegin(DATA1_FIELD_DESC);
        this.data1.write0(oprot);
        oprot.writeFieldEnd();
      }
      if (this.data2 != null) {
        oprot.writeFieldBegin(DATA2_FIELD_DESC);
        this.data2.write0(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
    private static class _MyDataFieldPatchLazy {
        private static final MyDataFieldPatch _DEFAULT = new MyDataFieldPatch.Builder().build();
    }
    
    public static MyDataFieldPatch defaultInstance() {
        return  _MyDataFieldPatchLazy._DEFAULT;
    }
}
