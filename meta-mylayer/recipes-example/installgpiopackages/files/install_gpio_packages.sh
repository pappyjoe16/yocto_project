#!/bin/sh

# Install gpiozero package
if python3 -m pip show gpiozero >/dev/null 2>&1; then
    echo "gpiozero is already installed"
else
    echo "Installing gpiozero..."
    if python3 -m pip install gpiozero; then
        echo "gpiozero installed successfully"
    else
        echo "Failed to install gpiozero"
    fi
fi

# Install rgpio package
if python3 -m pip show rgpio >/dev/null 2>&1; then
    echo "rgpio is already installed"
else
    echo "Installing rgpio..."
    if python3 -m pip install rgpio; then
        echo "rgpio installed successfully"
    else
        echo "Failed to install rgpio"
    fi
fi

exit 0 

