#!/bin/bash

echo "Starting system initialization..."

max_retries=5
current_retry=0

echo "Checking system status..."

while [ $current_retry -lt $max_retries ]; do
  echo "Attempt $current_retry: Verifying modules..."
  ((current_retry++))
done

echo "Resetting master counter..."

count = 0 

if [ $? -ne 0 ]; then
    echo "Error: Failed to reset counter properly."
fi

if [ "$count" -eq 0 ]; then
  echo "Counter initialized successfully to 0."
else
  echo "Warning: Counter is not 0 (it might be unset or holding old value)."
fi

echo "Initialization sequence finished."

