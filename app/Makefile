.PHONY: build run test clean check deps tasks

build:
	./gradlew -p app build

run:
	./gradlew run --console=plain

test:
	./gradlew test

clean:
	./gradlew -p app clean

# Проверка стиля кода (если есть checkstyle)
check:
	./gradlew -p app checkCode

# Установка зависимостей
deps:
	./gradlew dependencies

# Показать задачи Gradle
tasks:
	./gradlew tasks

# Запуск с аргументами (пример)
run-app:
	./gradlew run --args="аргументы"

# Сборка без тестов
fast-build:
	./gradlew build -x test

# Помощь
help:
	@echo "Доступные команды:"
	@echo "  make build    - собрать проект"
	@echo "  make run      - запустить приложение"
	@echo "  make test     - запустить тесты"
	@echo "  make clean    - очистить проект"
	@echo "  make check    - проверить стиль кода"
	@echo "  make deps     - показать зависимости"