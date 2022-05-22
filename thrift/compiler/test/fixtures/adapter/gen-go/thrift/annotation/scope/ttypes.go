// Autogenerated by Thrift Compiler (facebook)
// DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
// @generated

package scope

import (
	"bytes"
	"context"
	"sync"
	"fmt"
	thrift "github.com/facebook/fbthrift/thrift/lib/go/thrift"
)

// (needed to ensure safety because of naive import list construction.)
var _ = thrift.ZERO
var _ = fmt.Printf
var _ = sync.Mutex{}
var _ = bytes.Equal
var _ = context.Background

var GoUnusedProtection__ int;

type Enum = FbthriftInternalEnum

func EnumPtr(v Enum) *Enum { return &v }

func NewEnum() *Enum { return NewFbthriftInternalEnum() }

type Program struct {
}

func NewProgram() *Program {
  return &Program{}
}

type ProgramBuilder struct {
  obj *Program
}

func NewProgramBuilder() *ProgramBuilder{
  return &ProgramBuilder{
    obj: NewProgram(),
  }
}

func (p ProgramBuilder) Emit() *Program{
  return &Program{
  }
}

func (p *Program) Read(iprot thrift.Protocol) error {
  if _, err := iprot.ReadStructBegin(); err != nil {
    return thrift.PrependError(fmt.Sprintf("%T read error: ", p), err)
  }


  for {
    _, fieldTypeId, fieldId, err := iprot.ReadFieldBegin()
    if err != nil {
      return thrift.PrependError(fmt.Sprintf("%T field %d read error: ", p, fieldId), err)
    }
    if fieldTypeId == thrift.STOP { break; }
    if err := iprot.Skip(fieldTypeId); err != nil {
      return err
    }
    if err := iprot.ReadFieldEnd(); err != nil {
      return err
    }
  }
  if err := iprot.ReadStructEnd(); err != nil {
    return thrift.PrependError(fmt.Sprintf("%T read struct end error: ", p), err)
  }
  return nil
}

func (p *Program) Write(oprot thrift.Protocol) error {
  if err := oprot.WriteStructBegin("Program"); err != nil {
    return thrift.PrependError(fmt.Sprintf("%T write struct begin error: ", p), err) }
  if err := oprot.WriteFieldStop(); err != nil {
    return thrift.PrependError("write field stop error: ", err) }
  if err := oprot.WriteStructEnd(); err != nil {
    return thrift.PrependError("write struct stop error: ", err) }
  return nil
}

func (p *Program) String() string {
  if p == nil {
    return "<nil>"
  }

  return fmt.Sprintf("Program({})")
}

type Struct struct {
}

func NewStruct() *Struct {
  return &Struct{}
}

type StructBuilder struct {
  obj *Struct
}

func NewStructBuilder() *StructBuilder{
  return &StructBuilder{
    obj: NewStruct(),
  }
}

func (p StructBuilder) Emit() *Struct{
  return &Struct{
  }
}

func (p *Struct) Read(iprot thrift.Protocol) error {
  if _, err := iprot.ReadStructBegin(); err != nil {
    return thrift.PrependError(fmt.Sprintf("%T read error: ", p), err)
  }


  for {
    _, fieldTypeId, fieldId, err := iprot.ReadFieldBegin()
    if err != nil {
      return thrift.PrependError(fmt.Sprintf("%T field %d read error: ", p, fieldId), err)
    }
    if fieldTypeId == thrift.STOP { break; }
    if err := iprot.Skip(fieldTypeId); err != nil {
      return err
    }
    if err := iprot.ReadFieldEnd(); err != nil {
      return err
    }
  }
  if err := iprot.ReadStructEnd(); err != nil {
    return thrift.PrependError(fmt.Sprintf("%T read struct end error: ", p), err)
  }
  return nil
}

func (p *Struct) Write(oprot thrift.Protocol) error {
  if err := oprot.WriteStructBegin("Struct"); err != nil {
    return thrift.PrependError(fmt.Sprintf("%T write struct begin error: ", p), err) }
  if err := oprot.WriteFieldStop(); err != nil {
    return thrift.PrependError("write field stop error: ", err) }
  if err := oprot.WriteStructEnd(); err != nil {
    return thrift.PrependError("write struct stop error: ", err) }
  return nil
}

func (p *Struct) String() string {
  if p == nil {
    return "<nil>"
  }

  return fmt.Sprintf("Struct({})")
}

type Union struct {
}

func NewUnion() *Union {
  return &Union{}
}

type UnionBuilder struct {
  obj *Union
}

func NewUnionBuilder() *UnionBuilder{
  return &UnionBuilder{
    obj: NewUnion(),
  }
}

func (p UnionBuilder) Emit() *Union{
  return &Union{
  }
}

func (p *Union) Read(iprot thrift.Protocol) error {
  if _, err := iprot.ReadStructBegin(); err != nil {
    return thrift.PrependError(fmt.Sprintf("%T read error: ", p), err)
  }


  for {
    _, fieldTypeId, fieldId, err := iprot.ReadFieldBegin()
    if err != nil {
      return thrift.PrependError(fmt.Sprintf("%T field %d read error: ", p, fieldId), err)
    }
    if fieldTypeId == thrift.STOP { break; }
    if err := iprot.Skip(fieldTypeId); err != nil {
      return err
    }
    if err := iprot.ReadFieldEnd(); err != nil {
      return err
    }
  }
  if err := iprot.ReadStructEnd(); err != nil {
    return thrift.PrependError(fmt.Sprintf("%T read struct end error: ", p), err)
  }
  return nil
}

func (p *Union) Write(oprot thrift.Protocol) error {
  if err := oprot.WriteStructBegin("Union"); err != nil {
    return thrift.PrependError(fmt.Sprintf("%T write struct begin error: ", p), err) }
  if err := oprot.WriteFieldStop(); err != nil {
    return thrift.PrependError("write field stop error: ", err) }
  if err := oprot.WriteStructEnd(); err != nil {
    return thrift.PrependError("write struct stop error: ", err) }
  return nil
}

func (p *Union) String() string {
  if p == nil {
    return "<nil>"
  }

  return fmt.Sprintf("Union({})")
}

type Exception struct {
}

func NewException() *Exception {
  return &Exception{}
}

type ExceptionBuilder struct {
  obj *Exception
}

func NewExceptionBuilder() *ExceptionBuilder{
  return &ExceptionBuilder{
    obj: NewException(),
  }
}

func (p ExceptionBuilder) Emit() *Exception{
  return &Exception{
  }
}

func (p *Exception) Read(iprot thrift.Protocol) error {
  if _, err := iprot.ReadStructBegin(); err != nil {
    return thrift.PrependError(fmt.Sprintf("%T read error: ", p), err)
  }


  for {
    _, fieldTypeId, fieldId, err := iprot.ReadFieldBegin()
    if err != nil {
      return thrift.PrependError(fmt.Sprintf("%T field %d read error: ", p, fieldId), err)
    }
    if fieldTypeId == thrift.STOP { break; }
    if err := iprot.Skip(fieldTypeId); err != nil {
      return err
    }
    if err := iprot.ReadFieldEnd(); err != nil {
      return err
    }
  }
  if err := iprot.ReadStructEnd(); err != nil {
    return thrift.PrependError(fmt.Sprintf("%T read struct end error: ", p), err)
  }
  return nil
}

func (p *Exception) Write(oprot thrift.Protocol) error {
  if err := oprot.WriteStructBegin("Exception"); err != nil {
    return thrift.PrependError(fmt.Sprintf("%T write struct begin error: ", p), err) }
  if err := oprot.WriteFieldStop(); err != nil {
    return thrift.PrependError("write field stop error: ", err) }
  if err := oprot.WriteStructEnd(); err != nil {
    return thrift.PrependError("write struct stop error: ", err) }
  return nil
}

func (p *Exception) String() string {
  if p == nil {
    return "<nil>"
  }

  return fmt.Sprintf("Exception({})")
}

type Field struct {
}

func NewField() *Field {
  return &Field{}
}

type FieldBuilder struct {
  obj *Field
}

func NewFieldBuilder() *FieldBuilder{
  return &FieldBuilder{
    obj: NewField(),
  }
}

func (p FieldBuilder) Emit() *Field{
  return &Field{
  }
}

func (p *Field) Read(iprot thrift.Protocol) error {
  if _, err := iprot.ReadStructBegin(); err != nil {
    return thrift.PrependError(fmt.Sprintf("%T read error: ", p), err)
  }


  for {
    _, fieldTypeId, fieldId, err := iprot.ReadFieldBegin()
    if err != nil {
      return thrift.PrependError(fmt.Sprintf("%T field %d read error: ", p, fieldId), err)
    }
    if fieldTypeId == thrift.STOP { break; }
    if err := iprot.Skip(fieldTypeId); err != nil {
      return err
    }
    if err := iprot.ReadFieldEnd(); err != nil {
      return err
    }
  }
  if err := iprot.ReadStructEnd(); err != nil {
    return thrift.PrependError(fmt.Sprintf("%T read struct end error: ", p), err)
  }
  return nil
}

func (p *Field) Write(oprot thrift.Protocol) error {
  if err := oprot.WriteStructBegin("Field"); err != nil {
    return thrift.PrependError(fmt.Sprintf("%T write struct begin error: ", p), err) }
  if err := oprot.WriteFieldStop(); err != nil {
    return thrift.PrependError("write field stop error: ", err) }
  if err := oprot.WriteStructEnd(); err != nil {
    return thrift.PrependError("write struct stop error: ", err) }
  return nil
}

func (p *Field) String() string {
  if p == nil {
    return "<nil>"
  }

  return fmt.Sprintf("Field({})")
}

type Typedef struct {
}

func NewTypedef() *Typedef {
  return &Typedef{}
}

type TypedefBuilder struct {
  obj *Typedef
}

func NewTypedefBuilder() *TypedefBuilder{
  return &TypedefBuilder{
    obj: NewTypedef(),
  }
}

func (p TypedefBuilder) Emit() *Typedef{
  return &Typedef{
  }
}

func (p *Typedef) Read(iprot thrift.Protocol) error {
  if _, err := iprot.ReadStructBegin(); err != nil {
    return thrift.PrependError(fmt.Sprintf("%T read error: ", p), err)
  }


  for {
    _, fieldTypeId, fieldId, err := iprot.ReadFieldBegin()
    if err != nil {
      return thrift.PrependError(fmt.Sprintf("%T field %d read error: ", p, fieldId), err)
    }
    if fieldTypeId == thrift.STOP { break; }
    if err := iprot.Skip(fieldTypeId); err != nil {
      return err
    }
    if err := iprot.ReadFieldEnd(); err != nil {
      return err
    }
  }
  if err := iprot.ReadStructEnd(); err != nil {
    return thrift.PrependError(fmt.Sprintf("%T read struct end error: ", p), err)
  }
  return nil
}

func (p *Typedef) Write(oprot thrift.Protocol) error {
  if err := oprot.WriteStructBegin("Typedef"); err != nil {
    return thrift.PrependError(fmt.Sprintf("%T write struct begin error: ", p), err) }
  if err := oprot.WriteFieldStop(); err != nil {
    return thrift.PrependError("write field stop error: ", err) }
  if err := oprot.WriteStructEnd(); err != nil {
    return thrift.PrependError("write struct stop error: ", err) }
  return nil
}

func (p *Typedef) String() string {
  if p == nil {
    return "<nil>"
  }

  return fmt.Sprintf("Typedef({})")
}

type Service struct {
}

func NewService() *Service {
  return &Service{}
}

type ServiceBuilder struct {
  obj *Service
}

func NewServiceBuilder() *ServiceBuilder{
  return &ServiceBuilder{
    obj: NewService(),
  }
}

func (p ServiceBuilder) Emit() *Service{
  return &Service{
  }
}

func (p *Service) Read(iprot thrift.Protocol) error {
  if _, err := iprot.ReadStructBegin(); err != nil {
    return thrift.PrependError(fmt.Sprintf("%T read error: ", p), err)
  }


  for {
    _, fieldTypeId, fieldId, err := iprot.ReadFieldBegin()
    if err != nil {
      return thrift.PrependError(fmt.Sprintf("%T field %d read error: ", p, fieldId), err)
    }
    if fieldTypeId == thrift.STOP { break; }
    if err := iprot.Skip(fieldTypeId); err != nil {
      return err
    }
    if err := iprot.ReadFieldEnd(); err != nil {
      return err
    }
  }
  if err := iprot.ReadStructEnd(); err != nil {
    return thrift.PrependError(fmt.Sprintf("%T read struct end error: ", p), err)
  }
  return nil
}

func (p *Service) Write(oprot thrift.Protocol) error {
  if err := oprot.WriteStructBegin("Service"); err != nil {
    return thrift.PrependError(fmt.Sprintf("%T write struct begin error: ", p), err) }
  if err := oprot.WriteFieldStop(); err != nil {
    return thrift.PrependError("write field stop error: ", err) }
  if err := oprot.WriteStructEnd(); err != nil {
    return thrift.PrependError("write struct stop error: ", err) }
  return nil
}

func (p *Service) String() string {
  if p == nil {
    return "<nil>"
  }

  return fmt.Sprintf("Service({})")
}

type Interaction struct {
}

func NewInteraction() *Interaction {
  return &Interaction{}
}

type InteractionBuilder struct {
  obj *Interaction
}

func NewInteractionBuilder() *InteractionBuilder{
  return &InteractionBuilder{
    obj: NewInteraction(),
  }
}

func (p InteractionBuilder) Emit() *Interaction{
  return &Interaction{
  }
}

func (p *Interaction) Read(iprot thrift.Protocol) error {
  if _, err := iprot.ReadStructBegin(); err != nil {
    return thrift.PrependError(fmt.Sprintf("%T read error: ", p), err)
  }


  for {
    _, fieldTypeId, fieldId, err := iprot.ReadFieldBegin()
    if err != nil {
      return thrift.PrependError(fmt.Sprintf("%T field %d read error: ", p, fieldId), err)
    }
    if fieldTypeId == thrift.STOP { break; }
    if err := iprot.Skip(fieldTypeId); err != nil {
      return err
    }
    if err := iprot.ReadFieldEnd(); err != nil {
      return err
    }
  }
  if err := iprot.ReadStructEnd(); err != nil {
    return thrift.PrependError(fmt.Sprintf("%T read struct end error: ", p), err)
  }
  return nil
}

func (p *Interaction) Write(oprot thrift.Protocol) error {
  if err := oprot.WriteStructBegin("Interaction"); err != nil {
    return thrift.PrependError(fmt.Sprintf("%T write struct begin error: ", p), err) }
  if err := oprot.WriteFieldStop(); err != nil {
    return thrift.PrependError("write field stop error: ", err) }
  if err := oprot.WriteStructEnd(); err != nil {
    return thrift.PrependError("write struct stop error: ", err) }
  return nil
}

func (p *Interaction) String() string {
  if p == nil {
    return "<nil>"
  }

  return fmt.Sprintf("Interaction({})")
}

type Function struct {
}

func NewFunction() *Function {
  return &Function{}
}

type FunctionBuilder struct {
  obj *Function
}

func NewFunctionBuilder() *FunctionBuilder{
  return &FunctionBuilder{
    obj: NewFunction(),
  }
}

func (p FunctionBuilder) Emit() *Function{
  return &Function{
  }
}

func (p *Function) Read(iprot thrift.Protocol) error {
  if _, err := iprot.ReadStructBegin(); err != nil {
    return thrift.PrependError(fmt.Sprintf("%T read error: ", p), err)
  }


  for {
    _, fieldTypeId, fieldId, err := iprot.ReadFieldBegin()
    if err != nil {
      return thrift.PrependError(fmt.Sprintf("%T field %d read error: ", p, fieldId), err)
    }
    if fieldTypeId == thrift.STOP { break; }
    if err := iprot.Skip(fieldTypeId); err != nil {
      return err
    }
    if err := iprot.ReadFieldEnd(); err != nil {
      return err
    }
  }
  if err := iprot.ReadStructEnd(); err != nil {
    return thrift.PrependError(fmt.Sprintf("%T read struct end error: ", p), err)
  }
  return nil
}

func (p *Function) Write(oprot thrift.Protocol) error {
  if err := oprot.WriteStructBegin("Function"); err != nil {
    return thrift.PrependError(fmt.Sprintf("%T write struct begin error: ", p), err) }
  if err := oprot.WriteFieldStop(); err != nil {
    return thrift.PrependError("write field stop error: ", err) }
  if err := oprot.WriteStructEnd(); err != nil {
    return thrift.PrependError("write struct stop error: ", err) }
  return nil
}

func (p *Function) String() string {
  if p == nil {
    return "<nil>"
  }

  return fmt.Sprintf("Function({})")
}

type EnumValue struct {
}

func NewEnumValue() *EnumValue {
  return &EnumValue{}
}

type EnumValueBuilder struct {
  obj *EnumValue
}

func NewEnumValueBuilder() *EnumValueBuilder{
  return &EnumValueBuilder{
    obj: NewEnumValue(),
  }
}

func (p EnumValueBuilder) Emit() *EnumValue{
  return &EnumValue{
  }
}

func (p *EnumValue) Read(iprot thrift.Protocol) error {
  if _, err := iprot.ReadStructBegin(); err != nil {
    return thrift.PrependError(fmt.Sprintf("%T read error: ", p), err)
  }


  for {
    _, fieldTypeId, fieldId, err := iprot.ReadFieldBegin()
    if err != nil {
      return thrift.PrependError(fmt.Sprintf("%T field %d read error: ", p, fieldId), err)
    }
    if fieldTypeId == thrift.STOP { break; }
    if err := iprot.Skip(fieldTypeId); err != nil {
      return err
    }
    if err := iprot.ReadFieldEnd(); err != nil {
      return err
    }
  }
  if err := iprot.ReadStructEnd(); err != nil {
    return thrift.PrependError(fmt.Sprintf("%T read struct end error: ", p), err)
  }
  return nil
}

func (p *EnumValue) Write(oprot thrift.Protocol) error {
  if err := oprot.WriteStructBegin("EnumValue"); err != nil {
    return thrift.PrependError(fmt.Sprintf("%T write struct begin error: ", p), err) }
  if err := oprot.WriteFieldStop(); err != nil {
    return thrift.PrependError("write field stop error: ", err) }
  if err := oprot.WriteStructEnd(); err != nil {
    return thrift.PrependError("write struct stop error: ", err) }
  return nil
}

func (p *EnumValue) String() string {
  if p == nil {
    return "<nil>"
  }

  return fmt.Sprintf("EnumValue({})")
}

type Const struct {
}

func NewConst() *Const {
  return &Const{}
}

type ConstBuilder struct {
  obj *Const
}

func NewConstBuilder() *ConstBuilder{
  return &ConstBuilder{
    obj: NewConst(),
  }
}

func (p ConstBuilder) Emit() *Const{
  return &Const{
  }
}

func (p *Const) Read(iprot thrift.Protocol) error {
  if _, err := iprot.ReadStructBegin(); err != nil {
    return thrift.PrependError(fmt.Sprintf("%T read error: ", p), err)
  }


  for {
    _, fieldTypeId, fieldId, err := iprot.ReadFieldBegin()
    if err != nil {
      return thrift.PrependError(fmt.Sprintf("%T field %d read error: ", p, fieldId), err)
    }
    if fieldTypeId == thrift.STOP { break; }
    if err := iprot.Skip(fieldTypeId); err != nil {
      return err
    }
    if err := iprot.ReadFieldEnd(); err != nil {
      return err
    }
  }
  if err := iprot.ReadStructEnd(); err != nil {
    return thrift.PrependError(fmt.Sprintf("%T read struct end error: ", p), err)
  }
  return nil
}

func (p *Const) Write(oprot thrift.Protocol) error {
  if err := oprot.WriteStructBegin("Const"); err != nil {
    return thrift.PrependError(fmt.Sprintf("%T write struct begin error: ", p), err) }
  if err := oprot.WriteFieldStop(); err != nil {
    return thrift.PrependError("write field stop error: ", err) }
  if err := oprot.WriteStructEnd(); err != nil {
    return thrift.PrependError("write struct stop error: ", err) }
  return nil
}

func (p *Const) String() string {
  if p == nil {
    return "<nil>"
  }

  return fmt.Sprintf("Const({})")
}

type Schema struct {
}

func NewSchema() *Schema {
  return &Schema{}
}

type SchemaBuilder struct {
  obj *Schema
}

func NewSchemaBuilder() *SchemaBuilder{
  return &SchemaBuilder{
    obj: NewSchema(),
  }
}

func (p SchemaBuilder) Emit() *Schema{
  return &Schema{
  }
}

func (p *Schema) Read(iprot thrift.Protocol) error {
  if _, err := iprot.ReadStructBegin(); err != nil {
    return thrift.PrependError(fmt.Sprintf("%T read error: ", p), err)
  }


  for {
    _, fieldTypeId, fieldId, err := iprot.ReadFieldBegin()
    if err != nil {
      return thrift.PrependError(fmt.Sprintf("%T field %d read error: ", p, fieldId), err)
    }
    if fieldTypeId == thrift.STOP { break; }
    if err := iprot.Skip(fieldTypeId); err != nil {
      return err
    }
    if err := iprot.ReadFieldEnd(); err != nil {
      return err
    }
  }
  if err := iprot.ReadStructEnd(); err != nil {
    return thrift.PrependError(fmt.Sprintf("%T read struct end error: ", p), err)
  }
  return nil
}

func (p *Schema) Write(oprot thrift.Protocol) error {
  if err := oprot.WriteStructBegin("Schema"); err != nil {
    return thrift.PrependError(fmt.Sprintf("%T write struct begin error: ", p), err) }
  if err := oprot.WriteFieldStop(); err != nil {
    return thrift.PrependError("write field stop error: ", err) }
  if err := oprot.WriteStructEnd(); err != nil {
    return thrift.PrependError("write struct stop error: ", err) }
  return nil
}

func (p *Schema) String() string {
  if p == nil {
    return "<nil>"
  }

  return fmt.Sprintf("Schema({})")
}

type FbthriftInternalEnum struct {
}

func NewFbthriftInternalEnum() *FbthriftInternalEnum {
  return &FbthriftInternalEnum{}
}

type FbthriftInternalEnumBuilder struct {
  obj *FbthriftInternalEnum
}

func NewFbthriftInternalEnumBuilder() *FbthriftInternalEnumBuilder{
  return &FbthriftInternalEnumBuilder{
    obj: NewFbthriftInternalEnum(),
  }
}

func (p FbthriftInternalEnumBuilder) Emit() *FbthriftInternalEnum{
  return &FbthriftInternalEnum{
  }
}

func (p *FbthriftInternalEnum) Read(iprot thrift.Protocol) error {
  if _, err := iprot.ReadStructBegin(); err != nil {
    return thrift.PrependError(fmt.Sprintf("%T read error: ", p), err)
  }


  for {
    _, fieldTypeId, fieldId, err := iprot.ReadFieldBegin()
    if err != nil {
      return thrift.PrependError(fmt.Sprintf("%T field %d read error: ", p, fieldId), err)
    }
    if fieldTypeId == thrift.STOP { break; }
    if err := iprot.Skip(fieldTypeId); err != nil {
      return err
    }
    if err := iprot.ReadFieldEnd(); err != nil {
      return err
    }
  }
  if err := iprot.ReadStructEnd(); err != nil {
    return thrift.PrependError(fmt.Sprintf("%T read struct end error: ", p), err)
  }
  return nil
}

func (p *FbthriftInternalEnum) Write(oprot thrift.Protocol) error {
  if err := oprot.WriteStructBegin("FbthriftInternalEnum"); err != nil {
    return thrift.PrependError(fmt.Sprintf("%T write struct begin error: ", p), err) }
  if err := oprot.WriteFieldStop(); err != nil {
    return thrift.PrependError("write field stop error: ", err) }
  if err := oprot.WriteStructEnd(); err != nil {
    return thrift.PrependError("write struct stop error: ", err) }
  return nil
}

func (p *FbthriftInternalEnum) String() string {
  if p == nil {
    return "<nil>"
  }

  return fmt.Sprintf("FbthriftInternalEnum({})")
}

type FbthriftInternalScopeTransitive struct {
}

func NewFbthriftInternalScopeTransitive() *FbthriftInternalScopeTransitive {
  return &FbthriftInternalScopeTransitive{}
}

type FbthriftInternalScopeTransitiveBuilder struct {
  obj *FbthriftInternalScopeTransitive
}

func NewFbthriftInternalScopeTransitiveBuilder() *FbthriftInternalScopeTransitiveBuilder{
  return &FbthriftInternalScopeTransitiveBuilder{
    obj: NewFbthriftInternalScopeTransitive(),
  }
}

func (p FbthriftInternalScopeTransitiveBuilder) Emit() *FbthriftInternalScopeTransitive{
  return &FbthriftInternalScopeTransitive{
  }
}

func (p *FbthriftInternalScopeTransitive) Read(iprot thrift.Protocol) error {
  if _, err := iprot.ReadStructBegin(); err != nil {
    return thrift.PrependError(fmt.Sprintf("%T read error: ", p), err)
  }


  for {
    _, fieldTypeId, fieldId, err := iprot.ReadFieldBegin()
    if err != nil {
      return thrift.PrependError(fmt.Sprintf("%T field %d read error: ", p, fieldId), err)
    }
    if fieldTypeId == thrift.STOP { break; }
    if err := iprot.Skip(fieldTypeId); err != nil {
      return err
    }
    if err := iprot.ReadFieldEnd(); err != nil {
      return err
    }
  }
  if err := iprot.ReadStructEnd(); err != nil {
    return thrift.PrependError(fmt.Sprintf("%T read struct end error: ", p), err)
  }
  return nil
}

func (p *FbthriftInternalScopeTransitive) Write(oprot thrift.Protocol) error {
  if err := oprot.WriteStructBegin("FbthriftInternalScopeTransitive"); err != nil {
    return thrift.PrependError(fmt.Sprintf("%T write struct begin error: ", p), err) }
  if err := oprot.WriteFieldStop(); err != nil {
    return thrift.PrependError("write field stop error: ", err) }
  if err := oprot.WriteStructEnd(); err != nil {
    return thrift.PrependError("write struct stop error: ", err) }
  return nil
}

func (p *FbthriftInternalScopeTransitive) String() string {
  if p == nil {
    return "<nil>"
  }

  return fmt.Sprintf("FbthriftInternalScopeTransitive({})")
}

type Structured struct {
}

func NewStructured() *Structured {
  return &Structured{}
}

type StructuredBuilder struct {
  obj *Structured
}

func NewStructuredBuilder() *StructuredBuilder{
  return &StructuredBuilder{
    obj: NewStructured(),
  }
}

func (p StructuredBuilder) Emit() *Structured{
  return &Structured{
  }
}

func (p *Structured) Read(iprot thrift.Protocol) error {
  if _, err := iprot.ReadStructBegin(); err != nil {
    return thrift.PrependError(fmt.Sprintf("%T read error: ", p), err)
  }


  for {
    _, fieldTypeId, fieldId, err := iprot.ReadFieldBegin()
    if err != nil {
      return thrift.PrependError(fmt.Sprintf("%T field %d read error: ", p, fieldId), err)
    }
    if fieldTypeId == thrift.STOP { break; }
    if err := iprot.Skip(fieldTypeId); err != nil {
      return err
    }
    if err := iprot.ReadFieldEnd(); err != nil {
      return err
    }
  }
  if err := iprot.ReadStructEnd(); err != nil {
    return thrift.PrependError(fmt.Sprintf("%T read struct end error: ", p), err)
  }
  return nil
}

func (p *Structured) Write(oprot thrift.Protocol) error {
  if err := oprot.WriteStructBegin("Structured"); err != nil {
    return thrift.PrependError(fmt.Sprintf("%T write struct begin error: ", p), err) }
  if err := oprot.WriteFieldStop(); err != nil {
    return thrift.PrependError("write field stop error: ", err) }
  if err := oprot.WriteStructEnd(); err != nil {
    return thrift.PrependError("write struct stop error: ", err) }
  return nil
}

func (p *Structured) String() string {
  if p == nil {
    return "<nil>"
  }

  return fmt.Sprintf("Structured({})")
}

type Interface struct {
}

func NewInterface() *Interface {
  return &Interface{}
}

type InterfaceBuilder struct {
  obj *Interface
}

func NewInterfaceBuilder() *InterfaceBuilder{
  return &InterfaceBuilder{
    obj: NewInterface(),
  }
}

func (p InterfaceBuilder) Emit() *Interface{
  return &Interface{
  }
}

func (p *Interface) Read(iprot thrift.Protocol) error {
  if _, err := iprot.ReadStructBegin(); err != nil {
    return thrift.PrependError(fmt.Sprintf("%T read error: ", p), err)
  }


  for {
    _, fieldTypeId, fieldId, err := iprot.ReadFieldBegin()
    if err != nil {
      return thrift.PrependError(fmt.Sprintf("%T field %d read error: ", p, fieldId), err)
    }
    if fieldTypeId == thrift.STOP { break; }
    if err := iprot.Skip(fieldTypeId); err != nil {
      return err
    }
    if err := iprot.ReadFieldEnd(); err != nil {
      return err
    }
  }
  if err := iprot.ReadStructEnd(); err != nil {
    return thrift.PrependError(fmt.Sprintf("%T read struct end error: ", p), err)
  }
  return nil
}

func (p *Interface) Write(oprot thrift.Protocol) error {
  if err := oprot.WriteStructBegin("Interface"); err != nil {
    return thrift.PrependError(fmt.Sprintf("%T write struct begin error: ", p), err) }
  if err := oprot.WriteFieldStop(); err != nil {
    return thrift.PrependError("write field stop error: ", err) }
  if err := oprot.WriteStructEnd(); err != nil {
    return thrift.PrependError("write struct stop error: ", err) }
  return nil
}

func (p *Interface) String() string {
  if p == nil {
    return "<nil>"
  }

  return fmt.Sprintf("Interface({})")
}

type RootDefinition struct {
}

func NewRootDefinition() *RootDefinition {
  return &RootDefinition{}
}

type RootDefinitionBuilder struct {
  obj *RootDefinition
}

func NewRootDefinitionBuilder() *RootDefinitionBuilder{
  return &RootDefinitionBuilder{
    obj: NewRootDefinition(),
  }
}

func (p RootDefinitionBuilder) Emit() *RootDefinition{
  return &RootDefinition{
  }
}

func (p *RootDefinition) Read(iprot thrift.Protocol) error {
  if _, err := iprot.ReadStructBegin(); err != nil {
    return thrift.PrependError(fmt.Sprintf("%T read error: ", p), err)
  }


  for {
    _, fieldTypeId, fieldId, err := iprot.ReadFieldBegin()
    if err != nil {
      return thrift.PrependError(fmt.Sprintf("%T field %d read error: ", p, fieldId), err)
    }
    if fieldTypeId == thrift.STOP { break; }
    if err := iprot.Skip(fieldTypeId); err != nil {
      return err
    }
    if err := iprot.ReadFieldEnd(); err != nil {
      return err
    }
  }
  if err := iprot.ReadStructEnd(); err != nil {
    return thrift.PrependError(fmt.Sprintf("%T read struct end error: ", p), err)
  }
  return nil
}

func (p *RootDefinition) Write(oprot thrift.Protocol) error {
  if err := oprot.WriteStructBegin("RootDefinition"); err != nil {
    return thrift.PrependError(fmt.Sprintf("%T write struct begin error: ", p), err) }
  if err := oprot.WriteFieldStop(); err != nil {
    return thrift.PrependError("write field stop error: ", err) }
  if err := oprot.WriteStructEnd(); err != nil {
    return thrift.PrependError("write struct stop error: ", err) }
  return nil
}

func (p *RootDefinition) String() string {
  if p == nil {
    return "<nil>"
  }

  return fmt.Sprintf("RootDefinition({})")
}

type Definition struct {
}

func NewDefinition() *Definition {
  return &Definition{}
}

type DefinitionBuilder struct {
  obj *Definition
}

func NewDefinitionBuilder() *DefinitionBuilder{
  return &DefinitionBuilder{
    obj: NewDefinition(),
  }
}

func (p DefinitionBuilder) Emit() *Definition{
  return &Definition{
  }
}

func (p *Definition) Read(iprot thrift.Protocol) error {
  if _, err := iprot.ReadStructBegin(); err != nil {
    return thrift.PrependError(fmt.Sprintf("%T read error: ", p), err)
  }


  for {
    _, fieldTypeId, fieldId, err := iprot.ReadFieldBegin()
    if err != nil {
      return thrift.PrependError(fmt.Sprintf("%T field %d read error: ", p, fieldId), err)
    }
    if fieldTypeId == thrift.STOP { break; }
    if err := iprot.Skip(fieldTypeId); err != nil {
      return err
    }
    if err := iprot.ReadFieldEnd(); err != nil {
      return err
    }
  }
  if err := iprot.ReadStructEnd(); err != nil {
    return thrift.PrependError(fmt.Sprintf("%T read struct end error: ", p), err)
  }
  return nil
}

func (p *Definition) Write(oprot thrift.Protocol) error {
  if err := oprot.WriteStructBegin("Definition"); err != nil {
    return thrift.PrependError(fmt.Sprintf("%T write struct begin error: ", p), err) }
  if err := oprot.WriteFieldStop(); err != nil {
    return thrift.PrependError("write field stop error: ", err) }
  if err := oprot.WriteStructEnd(); err != nil {
    return thrift.PrependError("write struct stop error: ", err) }
  return nil
}

func (p *Definition) String() string {
  if p == nil {
    return "<nil>"
  }

  return fmt.Sprintf("Definition({})")
}

