
        var display = document.getElementById('display');
        var equation = '';

        function appendNumber(number) {
            equation += number;
            display.value = equation;
        }

        function appendOperator(operator) {
            equation += operator;
            display.value = equation;
        }

        function clearDisplay() {
            equation = '';
            display.value = equation;
        }

        function calculateResult() {
            try {
                var result = eval(equation);
                display.value = result;
                equation = '';
            } catch (error) {
                alert('Invalid expression');
                equation = '';
            }
        }
  