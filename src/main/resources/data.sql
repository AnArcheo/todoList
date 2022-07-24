INSERT INTO todo(description, status, priority, is_completed, created_date, modified_date)
VALUES  ('do dishes 1', 'IN_PROGRESS', 'LOW', FALSE,CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP()),
        ('do exercises', 'ON_HOLD', 'URGENT', FALSE, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP()),
        ('do dinner', 'NOT_STARTED', 'IMPORTANT', FALSE,CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP()),
        ('walk a dog', 'COMPLETED', 'MEDIUM', TRUE, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());