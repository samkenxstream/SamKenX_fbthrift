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
@com.facebook.swift.codec.ThriftStruct(value="MyDataValuePatch", builder=MyDataValuePatch.Builder.class)
public final class MyDataValuePatch implements com.facebook.thrift.payload.ThriftSerializable {

    @ThriftConstructor
    public MyDataValuePatch(
        @com.facebook.swift.codec.ThriftField(value=1, name="assign", requiredness=Requiredness.OPTIONAL) final test.fixtures.patch.MyData assign,
        @com.facebook.swift.codec.ThriftField(value=2, name="clear", requiredness=) final boolean clear,
        @com.facebook.swift.codec.ThriftField(value=3, name="patch", requiredness=) final test.fixtures.patch.MyDataPatch patch
    ) {
        this.assign = assign;
        this.clear = clear;
        this.patch = patch;
    }
    
    @ThriftConstructor
    protected MyDataValuePatch() {
      this.assign = null;
      this.clear = false;
      this.patch = null;
    }
    
    public static class Builder {
    
        private test.fixtures.patch.MyData assign = null;
        private boolean clear = false;
        private test.fixtures.patch.MyDataPatch patch = null;
    
        @com.facebook.swift.codec.ThriftField(value=1, name="assign", requiredness=Requiredness.OPTIONAL)
        public Builder setAssign(test.fixtures.patch.MyData assign) {
            this.assign = assign;
            return this;
        }
    
        public test.fixtures.patch.MyData getAssign() { return assign; }
    
            @com.facebook.swift.codec.ThriftField(value=2, name="clear", requiredness=)
        public Builder setClear(boolean clear) {
            this.clear = clear;
            return this;
        }
    
        public boolean isClear() { return clear; }
    
            @com.facebook.swift.codec.ThriftField(value=3, name="patch", requiredness=)
        public Builder setPatch(test.fixtures.patch.MyDataPatch patch) {
            this.patch = patch;
            return this;
        }
    
        public test.fixtures.patch.MyDataPatch getPatch() { return patch; }
    
        public Builder() { }
        public Builder(MyDataValuePatch other) {
            this.assign = other.assign;
            this.clear = other.clear;
            this.patch = other.patch;
        }
    
        @ThriftConstructor
        public MyDataValuePatch build() {
            MyDataValuePatch result = new MyDataValuePatch (
                this.assign,
                this.clear,
                this.patch
            );
            return result;
        }
    }
                public static final Map<String, Integer> NAMES_TO_IDS = new HashMap();
    public static final Map<String, Integer> THRIFT_NAMES_TO_IDS = new HashMap();
    public static final Map<Integer, TField> FIELD_METADATA = new HashMap<>();
    private static final TStruct STRUCT_DESC = new TStruct("MyDataValuePatch");
    private final test.fixtures.patch.MyData assign;
    public static final int _ASSIGN = 1;
    private static final TField ASSIGN_FIELD_DESC = new TField("assign", TType.STRUCT, (short)1);
        private final boolean clear;
    public static final int _CLEAR = 2;
    private static final TField CLEAR_FIELD_DESC = new TField("clear", TType.BOOL, (short)2);
        private final test.fixtures.patch.MyDataPatch patch;
    public static final int _PATCH = 3;
    private static final TField PATCH_FIELD_DESC = new TField("patch", TType.STRUCT, (short)3);
    static {
      NAMES_TO_IDS.put("assign", 1);
      THRIFT_NAMES_TO_IDS.put("assign", 1);
      FIELD_METADATA.put(1, ASSIGN_FIELD_DESC);
      NAMES_TO_IDS.put("clear", 2);
      THRIFT_NAMES_TO_IDS.put("clear", 2);
      FIELD_METADATA.put(2, CLEAR_FIELD_DESC);
      NAMES_TO_IDS.put("patch", 3);
      THRIFT_NAMES_TO_IDS.put("patch", 3);
      FIELD_METADATA.put(3, PATCH_FIELD_DESC);
      com.facebook.thrift.type.TypeRegistry.add(new com.facebook.thrift.type.Type(
        new com.facebook.thrift.type.UniversalName("test.dev/fixtures/patch/MyDataValuePatch"), 
        MyDataValuePatch.class, MyDataValuePatch::read0));
    }
    
    @Nullable
    @com.facebook.swift.codec.ThriftField(value=1, name="assign", requiredness=Requiredness.OPTIONAL)
    public test.fixtures.patch.MyData getAssign() { return assign; }
    
    
    
    @com.facebook.swift.codec.ThriftField(value=2, name="clear", requiredness=)
    public boolean isClear() { return clear; }
    
    
    @Nullable
    @com.facebook.swift.codec.ThriftField(value=3, name="patch", requiredness=)
    public test.fixtures.patch.MyDataPatch getPatch() { return patch; }
    
    @java.lang.Override
    public String toString() {
        ToStringHelper helper = toStringHelper(this);
        helper.add("assign", assign);
        helper.add("clear", clear);
        helper.add("patch", patch);
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
    
        MyDataValuePatch other = (MyDataValuePatch)o;
    
        return
            Objects.equals(assign, other.assign) &&
    Objects.equals(clear, other.clear) &&
    Objects.equals(patch, other.patch) &&
            true;
    }
    
    @java.lang.Override
    public int hashCode() {
        return Arrays.deepHashCode(new Object[] {
            assign,
            clear,
            patch
        });
    }
    
    
    public static com.facebook.thrift.payload.Reader<MyDataValuePatch> asReader() {
      return MyDataValuePatch::read0;
    }
    
    public static MyDataValuePatch read0(TProtocol oprot) throws TException {
      TField __field;
      oprot.readStructBegin(MyDataValuePatch.NAMES_TO_IDS, MyDataValuePatch.THRIFT_NAMES_TO_IDS, MyDataValuePatch.FIELD_METADATA);
      MyDataValuePatch.Builder builder = new MyDataValuePatch.Builder();
      while (true) {
        __field = oprot.readFieldBegin();
        if (__field.type == TType.STOP) { break; }
        switch (__field.id) {
        case _ASSIGN:
          if (__field.type == TType.STRUCT) {
            test.fixtures.patch.MyData assign = test.fixtures.patch.MyData.read0(oprot);
            builder.setAssign(assign);
          } else {
            TProtocolUtil.skip(oprot, __field.type);
          }
          break;
        case _CLEAR:
          if (__field.type == TType.BOOL) {
            boolean clear = oprot.readBool();
            builder.setClear(clear);
          } else {
            TProtocolUtil.skip(oprot, __field.type);
          }
          break;
        case _PATCH:
          if (__field.type == TType.STRUCT) {
            test.fixtures.patch.MyDataPatch patch = test.fixtures.patch.MyDataPatch.read0(oprot);
            builder.setPatch(patch);
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
      if (this.assign != null) {
        oprot.writeFieldBegin(ASSIGN_FIELD_DESC);
        this.assign.write0(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(CLEAR_FIELD_DESC);
      oprot.writeBool(this.clear);
      oprot.writeFieldEnd();
      if (this.patch != null) {
        oprot.writeFieldBegin(PATCH_FIELD_DESC);
        this.patch.write0(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
    private static class _MyDataValuePatchLazy {
        private static final MyDataValuePatch _DEFAULT = new MyDataValuePatch.Builder().build();
    }
    
    public static MyDataValuePatch defaultInstance() {
        return  _MyDataValuePatchLazy._DEFAULT;
    }
}
