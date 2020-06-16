// @generated by Thrift. This file is probably not the place you want to edit!

#![allow(non_camel_case_types, non_snake_case, non_upper_case_globals, unused_crate_dependencies)]

pub use self::errors::*;
pub use self::types::*;

pub mod types {
    #![allow(clippy::redundant_closure)]


    #[derive(Clone, Debug, PartialEq, Eq, PartialOrd, Ord, Hash)]
    pub struct Foo {
        pub myInteger: ::std::primitive::i32,
        pub myString: ::std::option::Option<::std::string::String>,
        pub myBools: ::std::vec::Vec<::std::primitive::bool>,
        pub myNumbers: ::std::vec::Vec<::std::primitive::i32>,
    }

    impl ::std::default::Default for self::Foo {
        fn default() -> Self {
            Self {
                myInteger: ::std::default::Default::default(),
                myString: ::std::option::Option::None,
                myBools: ::std::default::Default::default(),
                myNumbers: ::std::default::Default::default(),
            }
        }
    }

    unsafe impl ::std::marker::Send for self::Foo {}
    unsafe impl ::std::marker::Sync for self::Foo {}

    impl ::fbthrift::GetTType for self::Foo {
        const TTYPE: ::fbthrift::TType = ::fbthrift::TType::Struct;
    }

    impl<P> ::fbthrift::Serialize<P> for self::Foo
    where
        P: ::fbthrift::ProtocolWriter,
    {
        fn write(&self, p: &mut P) {
            p.write_struct_begin("Foo");
            p.write_field_begin("myInteger", ::fbthrift::TType::I32, 1);
            ::fbthrift::Serialize::write(&self.myInteger, p);
            p.write_field_end();
            if let ::std::option::Option::Some(some) = &self.myString {
                p.write_field_begin("myString", ::fbthrift::TType::String, 2);
                ::fbthrift::Serialize::write(some, p);
                p.write_field_end();
            }
            p.write_field_begin("myBools", ::fbthrift::TType::List, 3);
            ::fbthrift::Serialize::write(&self.myBools, p);
            p.write_field_end();
            p.write_field_begin("myNumbers", ::fbthrift::TType::List, 4);
            ::fbthrift::Serialize::write(&self.myNumbers, p);
            p.write_field_end();
            p.write_field_stop();
            p.write_struct_end();
        }
    }

    impl<P> ::fbthrift::Deserialize<P> for self::Foo
    where
        P: ::fbthrift::ProtocolReader,
    {
        fn read(p: &mut P) -> ::anyhow::Result<Self> {
            let mut field_myInteger = ::std::option::Option::None;
            let mut field_myString = ::std::option::Option::None;
            let mut field_myBools = ::std::option::Option::None;
            let mut field_myNumbers = ::std::option::Option::None;
            let _ = p.read_struct_begin(|_| ())?;
            loop {
                let (_, fty, fid) = p.read_field_begin(|_| ())?;
                match (fty, fid as ::std::primitive::i32) {
                    (::fbthrift::TType::Stop, _) => break,
                    (::fbthrift::TType::I32, 1) => field_myInteger = ::std::option::Option::Some(::fbthrift::Deserialize::read(p)?),
                    (::fbthrift::TType::String, 2) => field_myString = ::std::option::Option::Some(::fbthrift::Deserialize::read(p)?),
                    (::fbthrift::TType::List, 3) => field_myBools = ::std::option::Option::Some(::fbthrift::Deserialize::read(p)?),
                    (::fbthrift::TType::List, 4) => field_myNumbers = ::std::option::Option::Some(::fbthrift::Deserialize::read(p)?),
                    (fty, _) => p.skip(fty)?,
                }
                p.read_field_end()?;
            }
            p.read_struct_end()?;
            ::std::result::Result::Ok(Self {
                myInteger: field_myInteger.unwrap_or_default(),
                myString: field_myString,
                myBools: field_myBools.unwrap_or_default(),
                myNumbers: field_myNumbers.unwrap_or_default(),
            })
        }
    }

}

pub mod errors {
}
