const tasks = [
  {
    id: 1,
    title: 'Человек',
    inputs: [
      { name: 'name', label: 'Имя', type: 'text', value: 'Иван' },
      { name: 'age', label: 'Возраст', type: 'number', value: 20 }
    ],
    run({ name, age }) {
      return `Person{name='${name}', age=${age}}`;
    }
  },
  {
    id: 2,
    title: 'Книга',
    inputs: [
      { name: 'title', label: 'Название', type: 'text', value: 'Java. Полный справочник' },
      { name: 'author', label: 'Автор', type: 'text', value: 'Герберт Шилдт' },
      { name: 'year', label: 'Год', type: 'number', value: 2023 }
    ],
    run({ title, author, year }) {
      return `Book{title='${title}', author='${author}', year=${year}}`;
    }
  },
  {
    id: 3,
    title: 'Машина',
    inputs: [
      { name: 'brand', label: 'Марка', type: 'text', value: 'Toyota' },
      { name: 'model', label: 'Модель', type: 'text', value: 'Corolla' },
      { name: 'year', label: 'Год', type: 'number', value: 2021 },
      { name: 'speed', label: 'Макс. скорость', type: 'number', value: 210 }
    ],
    run({ brand, model, year, speed }) {
      return `Car{brand='${brand}', model='${model}', year=${year}, maxSpeed=${speed}}`;
    }
  },
  {
    id: 4,
    title: 'Прямоугольник',
    run() {
      const width = 5;
      const height = 8;
      return `Площадь: ${width * height}, периметр: ${2 * (width + height)}`;
    }
  },
  {
    id: 5,
    title: 'Круг',
    run() {
      const r = 3.5;
      return `Площадь: ${Math.PI * r * r}, длина окружности: ${2 * Math.PI * r}`;
    }
  },
  {
    id: 6,
    title: 'Студент',
    inputs: [
      { name: 'name', label: 'Имя', type: 'text', value: 'Анна' },
      { name: 'age', label: 'Возраст', type: 'number', value: 18 },
      { name: 'score', label: 'Средний балл', type: 'number', value: 9.7, step: '0.1' }
    ],
    run({ name, age, score }) {
      return `Student{name='${name}', age=${age}, averageScore=${score}}`;
    }
  },
  {
    id: 7,
    title: 'Банковский счёт',
    inputs: [
      { name: 'number', label: 'Номер счёта', type: 'text', value: '1234567890' },
      { name: 'balance', label: 'Баланс', type: 'number', value: 1000 },
      { name: 'deposit', label: 'Пополнение', type: 'number', value: 250.5 },
      { name: 'withdraw', label: 'Снятие', type: 'number', value: 300 }
    ],
    run({ number, balance, deposit, withdraw }) {
      const total = balance + deposit - withdraw;
      return `BankAccount{number='${number}', balance=${total}}`;
    }
  },
  {
    id: 8,
    title: 'Сотрудник',
    inputs: [
      { name: 'name', label: 'Имя', type: 'text', value: 'Петр' },
      { name: 'position', label: 'Должность', type: 'text', value: 'Разработчик' },
      { name: 'salary', label: 'Зарплата', type: 'number', value: 95000 },
      { name: 'percent', label: 'Повышение %', type: 'number', value: 15 }
    ],
    run({ name, position, salary, percent }) {
      const newSalary = salary + salary * percent / 100;
      return `Employee{name='${name}', position='${position}', salary=${newSalary}}`;
    }
  },
  {
    id: 9,
    title: 'Точка',
    inputs: [
      { name: 'x1', label: 'x1', type: 'number', value: 0 },
      { name: 'y1', label: 'y1', type: 'number', value: 0 },
      { name: 'x2', label: 'x2', type: 'number', value: 3 },
      { name: 'y2', label: 'y2', type: 'number', value: 4 }
    ],
    run({ x1, y1, x2, y2 }) {
      const dist = Math.sqrt((x1 - x2) ** 2 + (y1 - y2) ** 2);
      return `Расстояние: ${dist}`;
    }
  },
  {
    id: 10,
    title: 'Треугольник',
    inputs: [
      { name: 'a', label: 'Сторона a', type: 'number', value: 3 },
      { name: 'b', label: 'Сторона b', type: 'number', value: 4 },
      { name: 'c', label: 'Сторона c', type: 'number', value: 5 }
    ],
    run({ a, b, c }) {
      return `Прямоугольный: ${Math.abs(a * a + b * b - c * c) < 1e-9 || Math.abs(a * a + c * c - b * b) < 1e-9 || Math.abs(b * b + c * c - a * a) < 1e-9}`;
    }
  },
  {
    id: 11,
    title: 'Кот',
    run() {
      return `Мяу!\nКот ест.\nCat{name='Мурзик', age=3}`;
    }
  },
  {
    id: 12,
    title: 'Собака',
    run() {
      return `Dog{name='Шарик', age=5, breed='Овчарка'}`;
    }
  },
  {
    id: 13,
    title: 'Товар',
    inputs: [
      { name: 'name', label: 'Название', type: 'text', value: 'Молоко' },
      { name: 'price', label: 'Цена', type: 'number', value: 60 },
      { name: 'quantity', label: 'Количество', type: 'number', value: 2 }
    ],
    run({ name, price, quantity }) {
      return `Сумма: ${price * quantity}`;
    }
  },
  {
    id: 14,
    title: 'Заказ',
    inputs: [
      { name: 'product', label: 'Товар', type: 'text', value: 'Кофта' },
      { name: 'price', label: 'Цена', type: 'number', value: 1200 },
      { name: 'count', label: 'Количество', type: 'number', value: 2 }
    ],
    run({ product, price, count }) {
      return `Итого: ${price * count}`;
    }
  },
  {
    id: 15,
    title: 'Дата',
    inputs: [
      { name: 'day', label: 'День', type: 'number', value: 29 },
      { name: 'month', label: 'Месяц', type: 'number', value: 2 },
      { name: 'year', label: 'Год', type: 'number', value: 2024 }
    ],
    run({ day, month, year }) {
      const leap = (year % 400 === 0) || (year % 4 === 0 && year % 100 !== 0);
      return `${day}.${month}.${year} -> високосный: ${leap}`;
    }
  },
  {
    id: 16,
    title: 'Время',
    inputs: [
      { name: 'hour', label: 'Часы', type: 'number', value: 23 },
      { name: 'minute', label: 'Минуты', type: 'number', value: 59 },
      { name: 'second', label: 'Секунды', type: 'number', value: 58 },
      { name: 'add', label: 'Добавить секунд', type: 'number', value: 5 }
    ],
    run({ hour, minute, second, add }) {
      let total = hour * 3600 + minute * 60 + second + add;
      const h = (Math.floor(total / 3600) % 24 + 24) % 24;
      total = total % 86400;
      const m = Math.floor((total % 3600) / 60);
      const s = total % 60;
      return `${String(h).padStart(2, '0')}:${String(m).padStart(2, '0')}:${String(s).padStart(2, '0')}`;
    }
  },
  {
    id: 17,
    title: 'Счётчик',
    run() {
      let count = 0;
      count += 1;
      count += 1;
      count -= 1;
      return `Counter{count=${count}}`;
    }
  },
  {
    id: 18,
    title: 'Пара',
    run() {
      return `Pair{key=Возраст, value=25}`;
    }
  },
  {
    id: 19,
    title: 'Ноутбук',
    run() {
      return `Notebook{brand='Lenovo', ram=16, storage=512}`;
    }
  },
  {
    id: 20,
    title: 'Лэптоп',
    run() {
      return `Laptop{brand='HP', ram=32, hdd=1024}`;
    }
  },
  {
    id: 21,
    title: 'Телефон',
    run() {
      return `Phone{model='Samsung', battery=4000}`;
    }
  },
  {
    id: 22,
    title: 'Дробь',
    run() {
      const gcd = (a, b) => (b === 0 ? a : gcd(b, a % b));
      const num = 3;
      const den = 9;
      const g = gcd(Math.abs(num), Math.abs(den));
      return `${num}/${den} = ${num / g}/${den / g}`;
    }
  },
  {
    id: 23,
    title: 'Комплексное число',
    run() {
      return `3.0+4.0i -> модуль: ${Math.sqrt(3 * 3 + 4 * 4)}`;
    }
  },
  {
    id: 24,
    title: 'Вектор',
    run() {
      const x = 3;
      const y = 4;
      return `Длина вектора: ${Math.sqrt(x * x + y * y)}`;
    }
  },
  {
    id: 25,
    title: 'Дом',
    run() {
      return `House{address='Лесная 12', area=120, rooms=5}`;
    }
  },
  {
    id: 26,
    title: 'Компьютер',
    run() {
      return `Computer{brand='Dell', price=80000.0}`;
    }
  },
  {
    id: 27,
    title: 'Группа студентов',
    run() {
      return `StudentGroup{students=[Student{name='Олег', age=19, averageScore=8.5}, Student{name='Марина', age=20, averageScore=9.1}]}`;
    }
  },
  {
    id: 28,
    title: 'Стек',
    run() {
      const stack = [10, 20, 30];
      const popped = stack.pop();
      return `Поп: ${popped}, размер: ${stack.length}`;
    }
  },
  {
    id: 29,
    title: 'Очередь',
    run() {
      const queue = ['A', 'B', 'C'];
      const first = queue.shift();
      return `Из очереди: ${first}, размер: ${queue.length}`;
    }
  },
  {
    id: 30,
    title: 'Пользователь',
    inputs: [
      { name: 'login', label: 'Логин', type: 'text', value: 'alex' },
      { name: 'password', label: 'Пароль', type: 'password', value: '123456' },
      { name: 'newPassword', label: 'Новый пароль', type: 'password', value: '654321' }
    ],
    run({ login, password, newPassword }) {
      return `User{login='${login}', password='${password}'}\nПароль изменён: ${newPassword}`;
    }
  }
];

const taskSelect = document.getElementById('taskSelect');
const taskForm = document.getElementById('taskForm');
const resultOutput = document.getElementById('resultOutput');
const runBtn = document.getElementById('runBtn');

function renderTaskOptions() {
  tasks.forEach((task) => {
    const option = document.createElement('option');
    option.value = task.id;
    option.textContent = `${task.id}. ${task.title}`;
    taskSelect.appendChild(option);
  });
}

function renderForm() {
  const selectedTask = tasks.find((task) => Number(task.id) === Number(taskSelect.value));
  taskForm.innerHTML = '';

  if (!selectedTask || !selectedTask.inputs || selectedTask.inputs.length === 0) {
    const info = document.createElement('div');
    info.className = 'field';
    info.innerHTML = '<label>Для этого задания значения задаются автоматически по шаблону.</label>';
    taskForm.appendChild(info);
    return;
  }

  selectedTask.inputs.forEach((field) => {
    const wrapper = document.createElement('div');
    wrapper.className = 'field';

    const label = document.createElement('label');
    label.textContent = field.label;
    label.setAttribute('for', `${selectedTask.id}-${field.name}`);

    const input = document.createElement('input');
    input.id = `${selectedTask.id}-${field.name}`;
    input.name = field.name;
    input.type = field.type || 'text';
    input.value = field.value ?? '';
    if (field.step) input.step = field.step;

    wrapper.appendChild(label);
    wrapper.appendChild(input);
    taskForm.appendChild(wrapper);
  });
}

function collectValues(task) {
  const result = {};
  if (!task.inputs) return result;

  task.inputs.forEach((field) => {
    const input = document.getElementById(`${task.id}-${field.name}`);
    const raw = input ? input.value : field.value ?? '';
    result[field.name] = field.type === 'number' ? Number(raw) : raw;
  });

  return result;
}

function runTask() {
  const selectedTask = tasks.find((task) => Number(task.id) === Number(taskSelect.value));
  if (!selectedTask) {
    resultOutput.textContent = 'Выберите задание.';
    return;
  }

  const values = collectValues(selectedTask);
  const output = selectedTask.run ? selectedTask.run(values) : 'Нет данных';
  resultOutput.textContent = `Задание ${selectedTask.id}: ${selectedTask.title}\n\n${output}`;
}

renderTaskOptions();
renderForm();

taskSelect.addEventListener('change', renderForm);
runBtn.addEventListener('click', runTask);
