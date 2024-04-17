-- Создание таблицы для хранения тестов
CREATE TABLE tests (
                       test_id SERIAL PRIMARY KEY,
                       title VARCHAR(255) NOT NULL
);

-- Создание таблицы для хранения вопросов
CREATE TABLE questions (
                           question_id SERIAL PRIMARY KEY,
                           test_id INT,
                           question_text TEXT NOT NULL,
                           CONSTRAINT fk_test
                               FOREIGN KEY(test_id)
                                   REFERENCES tests(test_id)
                                   ON DELETE CASCADE
);

-- Создание таблицы для хранения вариантов ответов на вопросы
CREATE TABLE answers (
                         answer_id SERIAL PRIMARY KEY,
                         question_id INT,
                         answer_text TEXT NOT NULL,
                         is_correct BOOLEAN NOT NULL,
                         CONSTRAINT fk_question
                             FOREIGN KEY(question_id)
                                 REFERENCES questions(question_id)
                                 ON DELETE CASCADE
);

-- Добавление теста
INSERT INTO tests (title) VALUES ('Пример теста');

-- Добавление вопроса к тесту с ID 1
INSERT INTO questions (test_id, question_text) VALUES (1, 'Пример вопроса?');

-- Добавление вариантов ответов к вопросу с ID 1
INSERT INTO answers (question_id, answer_text, is_correct) VALUES
                                                               (1, 'Вариант ответа 1', FALSE),
                                                               (1, 'Вариант ответа 2', TRUE),
                                                               (1, 'Вариант ответа 3', FALSE);