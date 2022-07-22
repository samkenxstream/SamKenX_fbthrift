/**
 * Autogenerated by Thrift for src/module.thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated @nocommit
 */
#include "thrift/compiler/test/fixtures/deprecated-public-fields-for-cpp-ref/gen-cpp2/module_types.h"
#include "thrift/compiler/test/fixtures/deprecated-public-fields-for-cpp-ref/gen-cpp2/module_types.tcc"

#include <thrift/lib/cpp2/gen/module_types_cpp.h>

#include "thrift/compiler/test/fixtures/deprecated-public-fields-for-cpp-ref/gen-cpp2/module_data.h"


namespace apache {
namespace thrift {
namespace detail {

void TccStructTraits<::cpp2::Foo>::translateFieldName(
    folly::StringPiece _fname,
    int16_t& fid,
    apache::thrift::protocol::TType& _ftype) noexcept {
  using data = apache::thrift::TStructDataStorage<::cpp2::Foo>;
  static const st::translate_field_name_table table{
      data::fields_size,
      data::fields_names.data(),
      data::fields_ids.data(),
      data::fields_types.data()};
  st::translate_field_name(_fname, fid, _ftype, table);
}

} // namespace detail
} // namespace thrift
} // namespace apache

namespace cpp2 {

Foo::Foo(const Foo& srcObj) :
    __fbthrift_field_foo(::apache::thrift::detail::st::copy_field<
          ::apache::thrift::type_class::structure>(srcObj.__fbthrift_field_foo)),
    __fbthrift_field_bar(srcObj.__fbthrift_field_bar) {
}

Foo& Foo::operator=(const Foo& other) {
  Foo tmp(other);
  swap(*this, tmp);
  return *this;
}

Foo::Foo(FOLLY_MAYBE_UNUSED Foo&& other) noexcept  :
    __fbthrift_field_foo(std::move(other.__fbthrift_field_foo)),
    __fbthrift_field_bar(std::move(other.__fbthrift_field_bar)) {
}

Foo& Foo::operator=(FOLLY_MAYBE_UNUSED Foo&& other) noexcept {
    this->__fbthrift_field_foo = std::move(other.__fbthrift_field_foo);
    this->__fbthrift_field_bar = std::move(other.__fbthrift_field_bar);
    return *this;
}


Foo::Foo(apache::thrift::FragileConstructor, ::std::unique_ptr<::cpp2::Foo> foo__arg, ::std::shared_ptr<::cpp2::Foo> bar__arg) :
    __fbthrift_field_foo(std::move(foo__arg)),
    __fbthrift_field_bar(std::move(bar__arg)) {
}


void Foo::__fbthrift_clear() {
  // clear all fields
  this->__fbthrift_field_foo.reset();
  this->__fbthrift_field_bar.reset();
}

void Foo::__fbthrift_clear_terse_fields() {
}

bool Foo::__fbthrift_is_empty() const {
  return !(this->__fbthrift_field_foo) &&
 !(this->__fbthrift_field_bar);
}

bool Foo::operator==(FOLLY_MAYBE_UNUSED const Foo& rhs) const {
  FOLLY_MAYBE_UNUSED auto& lhs = *this;
  if ((!::apache::thrift::detail::pointer_equal(lhs.foo_ref(), rhs.foo_ref()))) {
    return false;
  }
  if ((!::apache::thrift::detail::pointer_equal(lhs.bar_ref(), rhs.bar_ref()))) {
    return false;
  }
  return true;
}

bool Foo::operator<(FOLLY_MAYBE_UNUSED const Foo& rhs) const {
  FOLLY_MAYBE_UNUSED auto& lhs = *this;
  if ((!::apache::thrift::detail::pointer_equal(lhs.foo_ref(), rhs.foo_ref()))) {
    return ::apache::thrift::detail::pointer_less(lhs.foo_ref(), rhs.foo_ref());
  }
  if ((!::apache::thrift::detail::pointer_equal(lhs.bar_ref(), rhs.bar_ref()))) {
    return ::apache::thrift::detail::pointer_less(lhs.bar_ref(), rhs.bar_ref());
  }
  return false;
}


void swap(FOLLY_MAYBE_UNUSED Foo& a, FOLLY_MAYBE_UNUSED Foo& b) {
  using ::std::swap;
  swap(a.__fbthrift_field_foo, b.__fbthrift_field_foo);
  swap(a.__fbthrift_field_bar, b.__fbthrift_field_bar);
}

template void Foo::readNoXfer<>(apache::thrift::BinaryProtocolReader*);
template uint32_t Foo::write<>(apache::thrift::BinaryProtocolWriter*) const;
template uint32_t Foo::serializedSize<>(apache::thrift::BinaryProtocolWriter const*) const;
template uint32_t Foo::serializedSizeZC<>(apache::thrift::BinaryProtocolWriter const*) const;
template void Foo::readNoXfer<>(apache::thrift::CompactProtocolReader*);
template uint32_t Foo::write<>(apache::thrift::CompactProtocolWriter*) const;
template uint32_t Foo::serializedSize<>(apache::thrift::CompactProtocolWriter const*) const;
template uint32_t Foo::serializedSizeZC<>(apache::thrift::CompactProtocolWriter const*) const;

static_assert(
    ::apache::thrift::detail::st::gen_check_json<
        Foo,
        ::apache::thrift::type_class::structure,
        ::cpp2::Foo>,
    "inconsistent use of json option");
static_assert(
    ::apache::thrift::detail::st::gen_check_json<
        Foo,
        ::apache::thrift::type_class::structure,
        ::cpp2::Foo>,
    "inconsistent use of json option");

} // cpp2

namespace cpp2 { namespace {
FOLLY_MAYBE_UNUSED FOLLY_ERASE void validateAdapters() {
}
}} // cpp2
