package g3summit

import groovy.transform.Immutable

@Immutable
class Book {
   String isbn;
   long quantity;
   BigDecimal price;
   String title;
   String author;
   String publisher;
}