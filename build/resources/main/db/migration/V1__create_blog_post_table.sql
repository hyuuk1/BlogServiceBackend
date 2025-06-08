CREATE TABLE blog_post (
                           id SERIAL PRIMARY KEY,
                           title VARCHAR(255) NOT NULL,
                           data TEXT NOT NULL,
                           publish_date TIMESTAMP NOT NULL
);