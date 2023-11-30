<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Celsius to Fahrenheit Converter</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            text-align: center;
        }
        #celsius-input {
            padding: 5px;
            font-size: 18px;
        }
        #convert-button {
            padding: 5px 10px;
            font-size: 18px;
            background-color: #007bff;
            color: white;
            border: none;
            cursor: pointer;
        }
        #result {
            font-size: 24px;
            margin-top: 10px;
        }
    </style>
</head>
<body>
    <h1>Celsius to Fahrenheit Converter</h1>
    <p>Enter temperature in Celsius:</p>
    <input type="number" id="celsius-input" min="-100" max="100">
    <button id="convert-button">Convert</button>
    <p id="result"></p>

    <script>
        // Get references to HTML elements
        const celsiusInput = document.getElementById('celsius-input');
        const convertButton = document.getElementById('convert-button');
        const resultElement = document.getElementById('result');

        // Event listener for the "Convert" button
        convertButton.addEventListener('click', () => {
            // Get the temperature in Celsius from the input field
            const celsius = parseFloat(celsiusInput.value);

            // Check if the input is a valid number
            if (!isNaN(celsius)) {
                // Perform the Celsius to Fahrenheit conversion
                const fahrenheit = (celsius * 9/5) + 32;
                resultElement.textContent = `${celsius}°C is equal to ${fahrenheit.toFixed(2)}°F`;
            } else {
                resultElement.textContent = 'Please enter a valid temperature in Celsius.';
            }
        });
    </script>
</body>
</html>

