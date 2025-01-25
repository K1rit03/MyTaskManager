CREATE TABLE users(
    id UUID PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE,
    email VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(100) NOT NULL,
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

    CREATE TABLE tasks (
        id UUID PRIMARY KEY,
        description VARCHAR(255) NOT NULL,
        status VARCHAR(50) NOT NULL,  -- Ensure status is not nullable
        priority VARCHAR(50) NOT NULL,  -- Ensure priority is not nullable
        target_date TIMESTAMP NOT NULL,  -- Target date for the task
        user_id UUID NOT NULL,
        FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE
    );

    CREATE INDEX idx_users_username ON users(username);
    CREATE INDEX idx_users_email ON users(email);

)