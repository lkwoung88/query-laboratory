CREATE TABLE t_article (
                        article_no INT PRIMARY KEY AUTO_INCREMENT,
                        sharing VARCHAR(10) NOT NULL,
                        content TEXT,
                        register_user_no INT NOT NULL,
                        register_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                        update_user_no INT NOT NULL,
                        update_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE t_user (
                        user_no INT PRIMARY KEY AUTO_INCREMENT,
                        user_id VARCHAR(64) NOT NULL,
                        pw VARCHAR(64) NOT NULL,
                        user_name VARCHAR(64) NOT NULL,
                        email VARCHAR(64) NOT NULL,
                        authority VARCHAR(10) NOT NULL,
                        group_no INT NOT NULL,
                        user_state VARCHAR(10) NOT NULL,
                        register_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                        update_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE t_group (
                         group_id INT PRIMARY KEY AUTO_INCREMENT,
                         group_name VARCHAR(64) NOT NULL,
                         group_leader_no INT NOT NULL,
                         group_state VARCHAR(10) NOT NULL,
                         register_user_no INT NOT NULL,
                         register_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                         update_user_no INT NOT NULL,
                         update_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
