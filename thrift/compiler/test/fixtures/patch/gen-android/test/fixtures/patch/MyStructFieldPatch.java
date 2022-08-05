/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package test.fixtures.patch;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.BitSet;
import java.util.Arrays;
import com.facebook.thrift.*;
import com.facebook.thrift.annotations.*;
import com.facebook.thrift.async.*;
import com.facebook.thrift.meta_data.*;
import com.facebook.thrift.server.*;
import com.facebook.thrift.transport.*;
import com.facebook.thrift.protocol.*;

@SuppressWarnings({ "unused", "serial" })
public class MyStructFieldPatch implements TBase, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("MyStructFieldPatch");
  private static final TField BOOL_VAL_FIELD_DESC = new TField("boolVal", TType.STRUCT, (short)1);
  private static final TField BYTE_VAL_FIELD_DESC = new TField("byteVal", TType.STRUCT, (short)2);
  private static final TField I16_VAL_FIELD_DESC = new TField("i16Val", TType.STRUCT, (short)3);
  private static final TField I32_VAL_FIELD_DESC = new TField("i32Val", TType.STRUCT, (short)4);
  private static final TField I64_VAL_FIELD_DESC = new TField("i64Val", TType.STRUCT, (short)5);
  private static final TField FLOAT_VAL_FIELD_DESC = new TField("floatVal", TType.STRUCT, (short)6);
  private static final TField DOUBLE_VAL_FIELD_DESC = new TField("doubleVal", TType.STRUCT, (short)7);
  private static final TField STRING_VAL_FIELD_DESC = new TField("stringVal", TType.STRUCT, (short)8);
  private static final TField BINARY_VAL_FIELD_DESC = new TField("binaryVal", TType.STRUCT, (short)9);
  private static final TField STRUCT_VAL_FIELD_DESC = new TField("structVal", TType.STRUCT, (short)10);
  private static final TField OPT_BOOL_VAL_FIELD_DESC = new TField("optBoolVal", TType.STRUCT, (short)11);
  private static final TField OPT_BYTE_VAL_FIELD_DESC = new TField("optByteVal", TType.STRUCT, (short)12);
  private static final TField OPT_I16_VAL_FIELD_DESC = new TField("optI16Val", TType.STRUCT, (short)13);
  private static final TField OPT_I32_VAL_FIELD_DESC = new TField("optI32Val", TType.STRUCT, (short)14);
  private static final TField OPT_I64_VAL_FIELD_DESC = new TField("optI64Val", TType.STRUCT, (short)15);
  private static final TField OPT_FLOAT_VAL_FIELD_DESC = new TField("optFloatVal", TType.STRUCT, (short)16);
  private static final TField OPT_DOUBLE_VAL_FIELD_DESC = new TField("optDoubleVal", TType.STRUCT, (short)17);
  private static final TField OPT_STRING_VAL_FIELD_DESC = new TField("optStringVal", TType.STRUCT, (short)18);
  private static final TField OPT_BINARY_VAL_FIELD_DESC = new TField("optBinaryVal", TType.STRUCT, (short)19);
  private static final TField OPT_STRUCT_VAL_FIELD_DESC = new TField("optStructVal", TType.STRUCT, (short)20);
  private static final TField OPT_LIST_VAL_FIELD_DESC = new TField("optListVal", TType.STRUCT, (short)21);
  private static final TField OPT_SET_VAL_FIELD_DESC = new TField("optSetVal", TType.STRUCT, (short)22);
  private static final TField OPT_MAP_VAL_FIELD_DESC = new TField("optMapVal", TType.STRUCT, (short)23);
  private static final TField UNION_VAL_FIELD_DESC = new TField("unionVal", TType.STRUCT, (short)30);

  public final BoolPatch boolVal;
  public final BytePatch byteVal;
  public final I16Patch i16Val;
  public final I32Patch i32Val;
  public final I64Patch i64Val;
  public final FloatPatch floatVal;
  public final DoublePatch doubleVal;
  public final StringPatch stringVal;
  public final BinaryPatch binaryVal;
  public final MyDataPatch structVal;
  public final OptionalBoolPatch optBoolVal;
  public final OptionalBytePatch optByteVal;
  public final OptionalI16Patch optI16Val;
  public final OptionalI32Patch optI32Val;
  public final OptionalI64Patch optI64Val;
  public final OptionalFloatPatch optFloatVal;
  public final OptionalDoublePatch optDoubleVal;
  public final OptionalStringPatch optStringVal;
  public final OptionalBinaryPatch optBinaryVal;
  public final OptionalMyDataPatch optStructVal;
  public final OptionalMyStructField21Patch optListVal;
  public final OptionalMyStructField22Patch optSetVal;
  public final OptionalMyStructField23Patch optMapVal;
  public final MyUnionPatch unionVal;
  public static final int BOOLVAL = 1;
  public static final int BYTEVAL = 2;
  public static final int I16VAL = 3;
  public static final int I32VAL = 4;
  public static final int I64VAL = 5;
  public static final int FLOATVAL = 6;
  public static final int DOUBLEVAL = 7;
  public static final int STRINGVAL = 8;
  public static final int BINARYVAL = 9;
  public static final int STRUCTVAL = 10;
  public static final int OPTBOOLVAL = 11;
  public static final int OPTBYTEVAL = 12;
  public static final int OPTI16VAL = 13;
  public static final int OPTI32VAL = 14;
  public static final int OPTI64VAL = 15;
  public static final int OPTFLOATVAL = 16;
  public static final int OPTDOUBLEVAL = 17;
  public static final int OPTSTRINGVAL = 18;
  public static final int OPTBINARYVAL = 19;
  public static final int OPTSTRUCTVAL = 20;
  public static final int OPTLISTVAL = 21;
  public static final int OPTSETVAL = 22;
  public static final int OPTMAPVAL = 23;
  public static final int UNIONVAL = 30;

  public MyStructFieldPatch(
      BoolPatch boolVal,
      BytePatch byteVal,
      I16Patch i16Val,
      I32Patch i32Val,
      I64Patch i64Val,
      FloatPatch floatVal,
      DoublePatch doubleVal,
      StringPatch stringVal,
      BinaryPatch binaryVal,
      MyDataPatch structVal,
      OptionalBoolPatch optBoolVal,
      OptionalBytePatch optByteVal,
      OptionalI16Patch optI16Val,
      OptionalI32Patch optI32Val,
      OptionalI64Patch optI64Val,
      OptionalFloatPatch optFloatVal,
      OptionalDoublePatch optDoubleVal,
      OptionalStringPatch optStringVal,
      OptionalBinaryPatch optBinaryVal,
      OptionalMyDataPatch optStructVal,
      OptionalMyStructField21Patch optListVal,
      OptionalMyStructField22Patch optSetVal,
      OptionalMyStructField23Patch optMapVal,
      MyUnionPatch unionVal) {
    this.boolVal = boolVal;
    this.byteVal = byteVal;
    this.i16Val = i16Val;
    this.i32Val = i32Val;
    this.i64Val = i64Val;
    this.floatVal = floatVal;
    this.doubleVal = doubleVal;
    this.stringVal = stringVal;
    this.binaryVal = binaryVal;
    this.structVal = structVal;
    this.optBoolVal = optBoolVal;
    this.optByteVal = optByteVal;
    this.optI16Val = optI16Val;
    this.optI32Val = optI32Val;
    this.optI64Val = optI64Val;
    this.optFloatVal = optFloatVal;
    this.optDoubleVal = optDoubleVal;
    this.optStringVal = optStringVal;
    this.optBinaryVal = optBinaryVal;
    this.optStructVal = optStructVal;
    this.optListVal = optListVal;
    this.optSetVal = optSetVal;
    this.optMapVal = optMapVal;
    this.unionVal = unionVal;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public MyStructFieldPatch(MyStructFieldPatch other) {
    if (other.isSetBoolVal()) {
      this.boolVal = TBaseHelper.deepCopy(other.boolVal);
    } else {
      this.boolVal = null;
    }
    if (other.isSetByteVal()) {
      this.byteVal = TBaseHelper.deepCopy(other.byteVal);
    } else {
      this.byteVal = null;
    }
    if (other.isSetI16Val()) {
      this.i16Val = TBaseHelper.deepCopy(other.i16Val);
    } else {
      this.i16Val = null;
    }
    if (other.isSetI32Val()) {
      this.i32Val = TBaseHelper.deepCopy(other.i32Val);
    } else {
      this.i32Val = null;
    }
    if (other.isSetI64Val()) {
      this.i64Val = TBaseHelper.deepCopy(other.i64Val);
    } else {
      this.i64Val = null;
    }
    if (other.isSetFloatVal()) {
      this.floatVal = TBaseHelper.deepCopy(other.floatVal);
    } else {
      this.floatVal = null;
    }
    if (other.isSetDoubleVal()) {
      this.doubleVal = TBaseHelper.deepCopy(other.doubleVal);
    } else {
      this.doubleVal = null;
    }
    if (other.isSetStringVal()) {
      this.stringVal = TBaseHelper.deepCopy(other.stringVal);
    } else {
      this.stringVal = null;
    }
    if (other.isSetBinaryVal()) {
      this.binaryVal = TBaseHelper.deepCopy(other.binaryVal);
    } else {
      this.binaryVal = null;
    }
    if (other.isSetStructVal()) {
      this.structVal = TBaseHelper.deepCopy(other.structVal);
    } else {
      this.structVal = null;
    }
    if (other.isSetOptBoolVal()) {
      this.optBoolVal = TBaseHelper.deepCopy(other.optBoolVal);
    } else {
      this.optBoolVal = null;
    }
    if (other.isSetOptByteVal()) {
      this.optByteVal = TBaseHelper.deepCopy(other.optByteVal);
    } else {
      this.optByteVal = null;
    }
    if (other.isSetOptI16Val()) {
      this.optI16Val = TBaseHelper.deepCopy(other.optI16Val);
    } else {
      this.optI16Val = null;
    }
    if (other.isSetOptI32Val()) {
      this.optI32Val = TBaseHelper.deepCopy(other.optI32Val);
    } else {
      this.optI32Val = null;
    }
    if (other.isSetOptI64Val()) {
      this.optI64Val = TBaseHelper.deepCopy(other.optI64Val);
    } else {
      this.optI64Val = null;
    }
    if (other.isSetOptFloatVal()) {
      this.optFloatVal = TBaseHelper.deepCopy(other.optFloatVal);
    } else {
      this.optFloatVal = null;
    }
    if (other.isSetOptDoubleVal()) {
      this.optDoubleVal = TBaseHelper.deepCopy(other.optDoubleVal);
    } else {
      this.optDoubleVal = null;
    }
    if (other.isSetOptStringVal()) {
      this.optStringVal = TBaseHelper.deepCopy(other.optStringVal);
    } else {
      this.optStringVal = null;
    }
    if (other.isSetOptBinaryVal()) {
      this.optBinaryVal = TBaseHelper.deepCopy(other.optBinaryVal);
    } else {
      this.optBinaryVal = null;
    }
    if (other.isSetOptStructVal()) {
      this.optStructVal = TBaseHelper.deepCopy(other.optStructVal);
    } else {
      this.optStructVal = null;
    }
    if (other.isSetOptListVal()) {
      this.optListVal = TBaseHelper.deepCopy(other.optListVal);
    } else {
      this.optListVal = null;
    }
    if (other.isSetOptSetVal()) {
      this.optSetVal = TBaseHelper.deepCopy(other.optSetVal);
    } else {
      this.optSetVal = null;
    }
    if (other.isSetOptMapVal()) {
      this.optMapVal = TBaseHelper.deepCopy(other.optMapVal);
    } else {
      this.optMapVal = null;
    }
    if (other.isSetUnionVal()) {
      this.unionVal = TBaseHelper.deepCopy(other.unionVal);
    } else {
      this.unionVal = null;
    }
  }

  public MyStructFieldPatch deepCopy() {
    return new MyStructFieldPatch(this);
  }

  public BoolPatch getBoolVal() {
    return this.boolVal;
  }

  // Returns true if field boolVal is set (has been assigned a value) and false otherwise
  public boolean isSetBoolVal() {
    return this.boolVal != null;
  }

  public BytePatch getByteVal() {
    return this.byteVal;
  }

  // Returns true if field byteVal is set (has been assigned a value) and false otherwise
  public boolean isSetByteVal() {
    return this.byteVal != null;
  }

  public I16Patch getI16Val() {
    return this.i16Val;
  }

  // Returns true if field i16Val is set (has been assigned a value) and false otherwise
  public boolean isSetI16Val() {
    return this.i16Val != null;
  }

  public I32Patch getI32Val() {
    return this.i32Val;
  }

  // Returns true if field i32Val is set (has been assigned a value) and false otherwise
  public boolean isSetI32Val() {
    return this.i32Val != null;
  }

  public I64Patch getI64Val() {
    return this.i64Val;
  }

  // Returns true if field i64Val is set (has been assigned a value) and false otherwise
  public boolean isSetI64Val() {
    return this.i64Val != null;
  }

  public FloatPatch getFloatVal() {
    return this.floatVal;
  }

  // Returns true if field floatVal is set (has been assigned a value) and false otherwise
  public boolean isSetFloatVal() {
    return this.floatVal != null;
  }

  public DoublePatch getDoubleVal() {
    return this.doubleVal;
  }

  // Returns true if field doubleVal is set (has been assigned a value) and false otherwise
  public boolean isSetDoubleVal() {
    return this.doubleVal != null;
  }

  public StringPatch getStringVal() {
    return this.stringVal;
  }

  // Returns true if field stringVal is set (has been assigned a value) and false otherwise
  public boolean isSetStringVal() {
    return this.stringVal != null;
  }

  public BinaryPatch getBinaryVal() {
    return this.binaryVal;
  }

  // Returns true if field binaryVal is set (has been assigned a value) and false otherwise
  public boolean isSetBinaryVal() {
    return this.binaryVal != null;
  }

  public MyDataPatch getStructVal() {
    return this.structVal;
  }

  // Returns true if field structVal is set (has been assigned a value) and false otherwise
  public boolean isSetStructVal() {
    return this.structVal != null;
  }

  public OptionalBoolPatch getOptBoolVal() {
    return this.optBoolVal;
  }

  // Returns true if field optBoolVal is set (has been assigned a value) and false otherwise
  public boolean isSetOptBoolVal() {
    return this.optBoolVal != null;
  }

  public OptionalBytePatch getOptByteVal() {
    return this.optByteVal;
  }

  // Returns true if field optByteVal is set (has been assigned a value) and false otherwise
  public boolean isSetOptByteVal() {
    return this.optByteVal != null;
  }

  public OptionalI16Patch getOptI16Val() {
    return this.optI16Val;
  }

  // Returns true if field optI16Val is set (has been assigned a value) and false otherwise
  public boolean isSetOptI16Val() {
    return this.optI16Val != null;
  }

  public OptionalI32Patch getOptI32Val() {
    return this.optI32Val;
  }

  // Returns true if field optI32Val is set (has been assigned a value) and false otherwise
  public boolean isSetOptI32Val() {
    return this.optI32Val != null;
  }

  public OptionalI64Patch getOptI64Val() {
    return this.optI64Val;
  }

  // Returns true if field optI64Val is set (has been assigned a value) and false otherwise
  public boolean isSetOptI64Val() {
    return this.optI64Val != null;
  }

  public OptionalFloatPatch getOptFloatVal() {
    return this.optFloatVal;
  }

  // Returns true if field optFloatVal is set (has been assigned a value) and false otherwise
  public boolean isSetOptFloatVal() {
    return this.optFloatVal != null;
  }

  public OptionalDoublePatch getOptDoubleVal() {
    return this.optDoubleVal;
  }

  // Returns true if field optDoubleVal is set (has been assigned a value) and false otherwise
  public boolean isSetOptDoubleVal() {
    return this.optDoubleVal != null;
  }

  public OptionalStringPatch getOptStringVal() {
    return this.optStringVal;
  }

  // Returns true if field optStringVal is set (has been assigned a value) and false otherwise
  public boolean isSetOptStringVal() {
    return this.optStringVal != null;
  }

  public OptionalBinaryPatch getOptBinaryVal() {
    return this.optBinaryVal;
  }

  // Returns true if field optBinaryVal is set (has been assigned a value) and false otherwise
  public boolean isSetOptBinaryVal() {
    return this.optBinaryVal != null;
  }

  public OptionalMyDataPatch getOptStructVal() {
    return this.optStructVal;
  }

  // Returns true if field optStructVal is set (has been assigned a value) and false otherwise
  public boolean isSetOptStructVal() {
    return this.optStructVal != null;
  }

  public OptionalMyStructField21Patch getOptListVal() {
    return this.optListVal;
  }

  // Returns true if field optListVal is set (has been assigned a value) and false otherwise
  public boolean isSetOptListVal() {
    return this.optListVal != null;
  }

  public OptionalMyStructField22Patch getOptSetVal() {
    return this.optSetVal;
  }

  // Returns true if field optSetVal is set (has been assigned a value) and false otherwise
  public boolean isSetOptSetVal() {
    return this.optSetVal != null;
  }

  public OptionalMyStructField23Patch getOptMapVal() {
    return this.optMapVal;
  }

  // Returns true if field optMapVal is set (has been assigned a value) and false otherwise
  public boolean isSetOptMapVal() {
    return this.optMapVal != null;
  }

  public MyUnionPatch getUnionVal() {
    return this.unionVal;
  }

  // Returns true if field unionVal is set (has been assigned a value) and false otherwise
  public boolean isSetUnionVal() {
    return this.unionVal != null;
  }

  @Override
  public boolean equals(Object _that) {
    if (_that == null)
      return false;
    if (this == _that)
      return true;
    if (!(_that instanceof MyStructFieldPatch))
      return false;
    MyStructFieldPatch that = (MyStructFieldPatch)_that;

    if (!TBaseHelper.equalsNobinary(this.isSetBoolVal(), that.isSetBoolVal(), this.boolVal, that.boolVal)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetByteVal(), that.isSetByteVal(), this.byteVal, that.byteVal)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetI16Val(), that.isSetI16Val(), this.i16Val, that.i16Val)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetI32Val(), that.isSetI32Val(), this.i32Val, that.i32Val)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetI64Val(), that.isSetI64Val(), this.i64Val, that.i64Val)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetFloatVal(), that.isSetFloatVal(), this.floatVal, that.floatVal)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetDoubleVal(), that.isSetDoubleVal(), this.doubleVal, that.doubleVal)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetStringVal(), that.isSetStringVal(), this.stringVal, that.stringVal)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetBinaryVal(), that.isSetBinaryVal(), this.binaryVal, that.binaryVal)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetStructVal(), that.isSetStructVal(), this.structVal, that.structVal)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetOptBoolVal(), that.isSetOptBoolVal(), this.optBoolVal, that.optBoolVal)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetOptByteVal(), that.isSetOptByteVal(), this.optByteVal, that.optByteVal)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetOptI16Val(), that.isSetOptI16Val(), this.optI16Val, that.optI16Val)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetOptI32Val(), that.isSetOptI32Val(), this.optI32Val, that.optI32Val)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetOptI64Val(), that.isSetOptI64Val(), this.optI64Val, that.optI64Val)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetOptFloatVal(), that.isSetOptFloatVal(), this.optFloatVal, that.optFloatVal)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetOptDoubleVal(), that.isSetOptDoubleVal(), this.optDoubleVal, that.optDoubleVal)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetOptStringVal(), that.isSetOptStringVal(), this.optStringVal, that.optStringVal)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetOptBinaryVal(), that.isSetOptBinaryVal(), this.optBinaryVal, that.optBinaryVal)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetOptStructVal(), that.isSetOptStructVal(), this.optStructVal, that.optStructVal)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetOptListVal(), that.isSetOptListVal(), this.optListVal, that.optListVal)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetOptSetVal(), that.isSetOptSetVal(), this.optSetVal, that.optSetVal)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetOptMapVal(), that.isSetOptMapVal(), this.optMapVal, that.optMapVal)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetUnionVal(), that.isSetUnionVal(), this.unionVal, that.unionVal)) { return false; }

    return true;
  }

  @Override
  public int hashCode() {
    return Arrays.deepHashCode(new Object[] {boolVal, byteVal, i16Val, i32Val, i64Val, floatVal, doubleVal, stringVal, binaryVal, structVal, optBoolVal, optByteVal, optI16Val, optI32Val, optI64Val, optFloatVal, optDoubleVal, optStringVal, optBinaryVal, optStructVal, optListVal, optSetVal, optMapVal, unionVal});
  }

  // This is required to satisfy the TBase interface, but can't be implemented on immutable struture.
  public void read(TProtocol iprot) throws TException {
    throw new TException("unimplemented in android immutable structure");
  }

  public static MyStructFieldPatch deserialize(TProtocol iprot) throws TException {
    BoolPatch tmp_boolVal = null;
    BytePatch tmp_byteVal = null;
    I16Patch tmp_i16Val = null;
    I32Patch tmp_i32Val = null;
    I64Patch tmp_i64Val = null;
    FloatPatch tmp_floatVal = null;
    DoublePatch tmp_doubleVal = null;
    StringPatch tmp_stringVal = null;
    BinaryPatch tmp_binaryVal = null;
    MyDataPatch tmp_structVal = null;
    OptionalBoolPatch tmp_optBoolVal = null;
    OptionalBytePatch tmp_optByteVal = null;
    OptionalI16Patch tmp_optI16Val = null;
    OptionalI32Patch tmp_optI32Val = null;
    OptionalI64Patch tmp_optI64Val = null;
    OptionalFloatPatch tmp_optFloatVal = null;
    OptionalDoublePatch tmp_optDoubleVal = null;
    OptionalStringPatch tmp_optStringVal = null;
    OptionalBinaryPatch tmp_optBinaryVal = null;
    OptionalMyDataPatch tmp_optStructVal = null;
    OptionalMyStructField21Patch tmp_optListVal = null;
    OptionalMyStructField22Patch tmp_optSetVal = null;
    OptionalMyStructField23Patch tmp_optMapVal = null;
    MyUnionPatch tmp_unionVal = null;
    TField __field;
    iprot.readStructBegin();
    while (true)
    {
      __field = iprot.readFieldBegin();
      if (__field.type == TType.STOP) {
        break;
      }
      switch (__field.id)
      {
        case BOOLVAL:
          if (__field.type == TType.STRUCT) {
            tmp_boolVal = BoolPatch.deserialize(iprot);
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case BYTEVAL:
          if (__field.type == TType.STRUCT) {
            tmp_byteVal = BytePatch.deserialize(iprot);
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case I16VAL:
          if (__field.type == TType.STRUCT) {
            tmp_i16Val = I16Patch.deserialize(iprot);
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case I32VAL:
          if (__field.type == TType.STRUCT) {
            tmp_i32Val = I32Patch.deserialize(iprot);
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case I64VAL:
          if (__field.type == TType.STRUCT) {
            tmp_i64Val = I64Patch.deserialize(iprot);
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case FLOATVAL:
          if (__field.type == TType.STRUCT) {
            tmp_floatVal = FloatPatch.deserialize(iprot);
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case DOUBLEVAL:
          if (__field.type == TType.STRUCT) {
            tmp_doubleVal = DoublePatch.deserialize(iprot);
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case STRINGVAL:
          if (__field.type == TType.STRUCT) {
            tmp_stringVal = StringPatch.deserialize(iprot);
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case BINARYVAL:
          if (__field.type == TType.STRUCT) {
            tmp_binaryVal = BinaryPatch.deserialize(iprot);
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case STRUCTVAL:
          if (__field.type == TType.STRUCT) {
            tmp_structVal = MyDataPatch.deserialize(iprot);
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case OPTBOOLVAL:
          if (__field.type == TType.STRUCT) {
            tmp_optBoolVal = OptionalBoolPatch.deserialize(iprot);
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case OPTBYTEVAL:
          if (__field.type == TType.STRUCT) {
            tmp_optByteVal = OptionalBytePatch.deserialize(iprot);
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case OPTI16VAL:
          if (__field.type == TType.STRUCT) {
            tmp_optI16Val = OptionalI16Patch.deserialize(iprot);
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case OPTI32VAL:
          if (__field.type == TType.STRUCT) {
            tmp_optI32Val = OptionalI32Patch.deserialize(iprot);
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case OPTI64VAL:
          if (__field.type == TType.STRUCT) {
            tmp_optI64Val = OptionalI64Patch.deserialize(iprot);
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case OPTFLOATVAL:
          if (__field.type == TType.STRUCT) {
            tmp_optFloatVal = OptionalFloatPatch.deserialize(iprot);
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case OPTDOUBLEVAL:
          if (__field.type == TType.STRUCT) {
            tmp_optDoubleVal = OptionalDoublePatch.deserialize(iprot);
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case OPTSTRINGVAL:
          if (__field.type == TType.STRUCT) {
            tmp_optStringVal = OptionalStringPatch.deserialize(iprot);
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case OPTBINARYVAL:
          if (__field.type == TType.STRUCT) {
            tmp_optBinaryVal = OptionalBinaryPatch.deserialize(iprot);
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case OPTSTRUCTVAL:
          if (__field.type == TType.STRUCT) {
            tmp_optStructVal = OptionalMyDataPatch.deserialize(iprot);
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case OPTLISTVAL:
          if (__field.type == TType.STRUCT) {
            tmp_optListVal = OptionalMyStructField21Patch.deserialize(iprot);
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case OPTSETVAL:
          if (__field.type == TType.STRUCT) {
            tmp_optSetVal = OptionalMyStructField22Patch.deserialize(iprot);
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case OPTMAPVAL:
          if (__field.type == TType.STRUCT) {
            tmp_optMapVal = OptionalMyStructField23Patch.deserialize(iprot);
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case UNIONVAL:
          if (__field.type == TType.STRUCT) {
            tmp_unionVal = MyUnionPatch.deserialize(iprot);
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, __field.type);
          break;
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    MyStructFieldPatch _that;
    _that = new MyStructFieldPatch(
      tmp_boolVal
      ,tmp_byteVal
      ,tmp_i16Val
      ,tmp_i32Val
      ,tmp_i64Val
      ,tmp_floatVal
      ,tmp_doubleVal
      ,tmp_stringVal
      ,tmp_binaryVal
      ,tmp_structVal
      ,tmp_optBoolVal
      ,tmp_optByteVal
      ,tmp_optI16Val
      ,tmp_optI32Val
      ,tmp_optI64Val
      ,tmp_optFloatVal
      ,tmp_optDoubleVal
      ,tmp_optStringVal
      ,tmp_optBinaryVal
      ,tmp_optStructVal
      ,tmp_optListVal
      ,tmp_optSetVal
      ,tmp_optMapVal
      ,tmp_unionVal
    );
    _that.validate();
    return _that;
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.boolVal != null) {
      oprot.writeFieldBegin(BOOL_VAL_FIELD_DESC);
      this.boolVal.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.byteVal != null) {
      oprot.writeFieldBegin(BYTE_VAL_FIELD_DESC);
      this.byteVal.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.i16Val != null) {
      oprot.writeFieldBegin(I16_VAL_FIELD_DESC);
      this.i16Val.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.i32Val != null) {
      oprot.writeFieldBegin(I32_VAL_FIELD_DESC);
      this.i32Val.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.i64Val != null) {
      oprot.writeFieldBegin(I64_VAL_FIELD_DESC);
      this.i64Val.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.floatVal != null) {
      oprot.writeFieldBegin(FLOAT_VAL_FIELD_DESC);
      this.floatVal.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.doubleVal != null) {
      oprot.writeFieldBegin(DOUBLE_VAL_FIELD_DESC);
      this.doubleVal.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.stringVal != null) {
      oprot.writeFieldBegin(STRING_VAL_FIELD_DESC);
      this.stringVal.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.binaryVal != null) {
      oprot.writeFieldBegin(BINARY_VAL_FIELD_DESC);
      this.binaryVal.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.structVal != null) {
      oprot.writeFieldBegin(STRUCT_VAL_FIELD_DESC);
      this.structVal.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.optBoolVal != null) {
      oprot.writeFieldBegin(OPT_BOOL_VAL_FIELD_DESC);
      this.optBoolVal.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.optByteVal != null) {
      oprot.writeFieldBegin(OPT_BYTE_VAL_FIELD_DESC);
      this.optByteVal.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.optI16Val != null) {
      oprot.writeFieldBegin(OPT_I16_VAL_FIELD_DESC);
      this.optI16Val.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.optI32Val != null) {
      oprot.writeFieldBegin(OPT_I32_VAL_FIELD_DESC);
      this.optI32Val.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.optI64Val != null) {
      oprot.writeFieldBegin(OPT_I64_VAL_FIELD_DESC);
      this.optI64Val.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.optFloatVal != null) {
      oprot.writeFieldBegin(OPT_FLOAT_VAL_FIELD_DESC);
      this.optFloatVal.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.optDoubleVal != null) {
      oprot.writeFieldBegin(OPT_DOUBLE_VAL_FIELD_DESC);
      this.optDoubleVal.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.optStringVal != null) {
      oprot.writeFieldBegin(OPT_STRING_VAL_FIELD_DESC);
      this.optStringVal.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.optBinaryVal != null) {
      oprot.writeFieldBegin(OPT_BINARY_VAL_FIELD_DESC);
      this.optBinaryVal.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.optStructVal != null) {
      oprot.writeFieldBegin(OPT_STRUCT_VAL_FIELD_DESC);
      this.optStructVal.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.optListVal != null) {
      oprot.writeFieldBegin(OPT_LIST_VAL_FIELD_DESC);
      this.optListVal.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.optSetVal != null) {
      oprot.writeFieldBegin(OPT_SET_VAL_FIELD_DESC);
      this.optSetVal.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.optMapVal != null) {
      oprot.writeFieldBegin(OPT_MAP_VAL_FIELD_DESC);
      this.optMapVal.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.unionVal != null) {
      oprot.writeFieldBegin(UNION_VAL_FIELD_DESC);
      this.unionVal.write(oprot);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    return toString(1, true);
  }

  @Override
  public String toString(int indent, boolean prettyPrint) {
    return TBaseHelper.toStringHelper(this, indent, prettyPrint);
  }

  public void validate() throws TException {
    // check for required fields
  }

}

