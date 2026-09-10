# Get Api Testing

## Users list - full response validation
* Api e GET request gönder "https://api.anarabbas.com/users"
* Status kodunu "200" olmalıdır
* Response cavab müddeti "3000" milliSaniyeden az olmalıdır
* Cavab array boş olmamalıdır
* Bütün elementlerin "id" sahesi boş olmamalıdır
* Bütün elementlerin "name" sahesi boş olmamalıdır
* Bütün elementlerin "email" sahesi boş olmamalıdır

## Single user - full response validation
* Api e GET request gönder "https://api.anarabbas.com/users/1"
* Status kodunu "200" olmalıdır
* Json cavabında "id" deyeri boş olmamlıdır
* Json cavabında "name" deyeri boş olmamlıdır
* Json cavabında "email" deyeri boş olmamlıdır

## Products list - full response validation
* Api e GET request gönder "https://api.anarabbas.com/products"
* Status kodunu "200" olmalıdır
* Cavab "data" array boş olmamalıdır
* Bütün elementlerin "data.id" sahesi boş olmamalıdır
* Bütün elementlerin "data.name" sahesi boş olmamalıdır
* Bütün elementlerin "data.price" sahesi boş olmamalıdır

## Single product - full response validation
* Api e GET request gönder "https://api.anarabbas.com/products/prod_001"
* Status kodunu "200" olmalıdır
* Json cavabında "id" deyeri boş olmamlıdır
* Json cavabında "name" deyeri boş olmamlıdır
* Json cavabında "price" deyeri boş olmamlıdır

## Product reviews - full response validation
* Api e GET request gönder "https://api.anarabbas.com/products/prod_001/reviews"
* Status kodunu "200" olmalıdır

## Posts list - full response validation
* Api e GET request gönder "https://api.anarabbas.com/posts"
* Status kodunu "200" olmalıdır
* Cavab "data" array boş olmamalıdır
* Bütün elementlerin "data.id" sahesi boş olmamalıdır
* Bütün elementlerin "data.title" sahesi boş olmamalıdır

## Single post - full response validation
* Api e GET request gönder "https://api.anarabbas.com/posts/post_001"
* Status kodunu "200" olmalıdır
* Json cavabında "id" deyeri boş olmamlıdır
* Json cavabında "title" deyeri boş olmamlıdır

## Post comments - full response validation
* Api e GET request gönder "https://api.anarabbas.com/posts/post_001/comments"
* Status kodunu "200" olmalıdır