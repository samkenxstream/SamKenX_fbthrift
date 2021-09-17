/**
 * Autogenerated by Thrift for src/include2.thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated @nocommit
 */
#pragma once

#include <thrift/lib/cpp2/gen/module_types_h.h>



namespace apache {
namespace thrift {
namespace tag {
struct i32Field;
struct strField;
} // namespace tag
namespace detail {
#ifndef APACHE_THRIFT_ACCESSOR_i32Field
#define APACHE_THRIFT_ACCESSOR_i32Field
APACHE_THRIFT_DEFINE_ACCESSOR(i32Field);
#endif
#ifndef APACHE_THRIFT_ACCESSOR_strField
#define APACHE_THRIFT_ACCESSOR_strField
APACHE_THRIFT_DEFINE_ACCESSOR(strField);
#endif
} // namespace detail
} // namespace thrift
} // namespace apache

// BEGIN declare_enums

// END declare_enums
// BEGIN forward_declare
namespace some { namespace ns {
class IncludedB;
}} // some::ns
// END forward_declare
// BEGIN typedefs

// END typedefs
// BEGIN hash_and_equal_to
// END hash_and_equal_to
THRIFT_IGNORE_ISSET_USE_WARNING_BEGIN
namespace some { namespace ns {
using ::apache::thrift::detail::operator!=;
using ::apache::thrift::detail::operator>;
using ::apache::thrift::detail::operator<=;
using ::apache::thrift::detail::operator>=;

class IncludedB final  {
 private:
  friend struct ::apache::thrift::detail::st::struct_private_access;

  //  used by a static_assert in the corresponding source
  static constexpr bool __fbthrift_cpp2_gen_json = false;
  static constexpr bool __fbthrift_cpp2_gen_nimble = false;
  static constexpr bool __fbthrift_cpp2_gen_has_thrift_uri = false;

 public:
  using __fbthrift_cpp2_type = IncludedB;
  static constexpr bool __fbthrift_cpp2_is_union =
    false;


 public:

  IncludedB() :
      i32Field(0) {
  }
  // FragileConstructor for use in initialization lists only.
  [[deprecated("This constructor is deprecated")]]
  IncludedB(apache::thrift::FragileConstructor, ::std::int32_t i32Field__arg, ::std::string strField__arg);

  IncludedB(IncludedB&&) noexcept;

  IncludedB(const IncludedB& src);


  IncludedB& operator=(IncludedB&&) noexcept;
  IncludedB& operator=(const IncludedB& src);
  void __clear();
 private:
  ::std::int32_t i32Field;
 private:
  ::std::string strField;

 private:
  [[deprecated("__isset field is deprecated in Thrift struct. Use _ref() accessors instead.")]]
  struct __isset {
    uint8_t i32Field;
    uint8_t strField;
    bool __fbthrift_get(folly::index_constant<0>) const {
      return i32Field == 1;
    }
    void __fbthrift_set(folly::index_constant<0>, bool isset_flag) {
      i32Field = isset_flag ? 1 : 0;
    }
    bool __fbthrift_get(folly::index_constant<1>) const {
      return strField == 1;
    }
    void __fbthrift_set(folly::index_constant<1>, bool isset_flag) {
      strField = isset_flag ? 1 : 0;
    }
  } __isset = {};

 public:

  bool operator==(const IncludedB&) const;
  bool operator<(const IncludedB&) const;

  template <typename..., typename T = ::std::int32_t>
  FOLLY_ERASE ::apache::thrift::field_ref<const T&> i32Field_ref() const& {
    return {this->i32Field, __isset.i32Field};
  }

  template <typename..., typename T = ::std::int32_t>
  FOLLY_ERASE ::apache::thrift::field_ref<const T&&> i32Field_ref() const&& {
    return {std::move(this->i32Field), __isset.i32Field};
  }

  template <typename..., typename T = ::std::int32_t>
  FOLLY_ERASE ::apache::thrift::field_ref<T&> i32Field_ref() & {
    return {this->i32Field, __isset.i32Field};
  }

  template <typename..., typename T = ::std::int32_t>
  FOLLY_ERASE ::apache::thrift::field_ref<T&&> i32Field_ref() && {
    return {std::move(this->i32Field), __isset.i32Field};
  }

  template <typename..., typename T = ::std::string>
  FOLLY_ERASE ::apache::thrift::field_ref<const T&> strField_ref() const& {
    return {this->strField, __isset.strField};
  }

  template <typename..., typename T = ::std::string>
  FOLLY_ERASE ::apache::thrift::field_ref<const T&&> strField_ref() const&& {
    return {std::move(this->strField), __isset.strField};
  }

  template <typename..., typename T = ::std::string>
  FOLLY_ERASE ::apache::thrift::field_ref<T&> strField_ref() & {
    return {this->strField, __isset.strField};
  }

  template <typename..., typename T = ::std::string>
  FOLLY_ERASE ::apache::thrift::field_ref<T&&> strField_ref() && {
    return {std::move(this->strField), __isset.strField};
  }

  ::std::int32_t get_i32Field() const {
    return i32Field;
  }

  [[deprecated("Use `FOO.i32Field_ref() = BAR;` instead of `FOO.set_i32Field(BAR);`")]]
  ::std::int32_t& set_i32Field(::std::int32_t i32Field_) {
    i32Field = i32Field_;
  __isset.__fbthrift_set(folly::index_constant<0>(), true);
    return i32Field;
  }

  const ::std::string& get_strField() const& {
    return strField;
  }

  ::std::string get_strField() && {
    return std::move(strField);
  }

  template <typename T_IncludedB_strField_struct_setter = ::std::string>
  [[deprecated("Use `FOO.strField_ref() = BAR;` instead of `FOO.set_strField(BAR);`")]]
  ::std::string& set_strField(T_IncludedB_strField_struct_setter&& strField_) {
    strField = std::forward<T_IncludedB_strField_struct_setter>(strField_);
    __isset.__fbthrift_set(folly::index_constant<1>(), true);
    return strField;
  }

  template <class Protocol_>
  uint32_t read(Protocol_* iprot);
  template <class Protocol_>
  uint32_t serializedSize(Protocol_ const* prot_) const;
  template <class Protocol_>
  uint32_t serializedSizeZC(Protocol_ const* prot_) const;
  template <class Protocol_>
  uint32_t write(Protocol_* prot_) const;

 private:
  template <class Protocol_>
  void readNoXfer(Protocol_* iprot);

  friend class ::apache::thrift::Cpp2Ops<IncludedB>;
  friend void swap(IncludedB& a, IncludedB& b);
};

template <class Protocol_>
uint32_t IncludedB::read(Protocol_* iprot) {
  auto _xferStart = iprot->getCursorPosition();
  readNoXfer(iprot);
  return iprot->getCursorPosition() - _xferStart;
}

}} // some::ns
THRIFT_IGNORE_ISSET_USE_WARNING_END
