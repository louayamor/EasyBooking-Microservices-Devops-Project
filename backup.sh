#!/bin/bash

DB_NAME="easybookingdb"
DB_USER="louayspring"
DB_PASSWORD="springlouay"
BACKUP_DIR="/home/$(whoami)/db_backups"
DATE=$(date +'%Y-%m-%d_%H-%M-%S')
BACKUP_FILE="$BACKUP_DIR/${DB_NAME}_backup_$DATE.sql"

mkdir -p "$BACKUP_DIR"

mysqldump -u "$DB_USER" -p"$DB_PASSWORD" "$DB_NAME" > "$BACKUP_FILE"

if [ $? -eq 0 ]; then
    echo "✅ Backup successful: $BACKUP_FILE"
else
    echo "❌ Backup failed"
fi
