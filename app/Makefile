.PHONY: build run test clean check deps tasks

build:
	cd code/app && ./gradlew build

run:
	./gradlew run --console=plain

test:
	./gradlew test

clean:
	./gradlew clean

# Проверка стиля кода (если есть checkstyle)
check:
	./gradlew check

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

setup:
	cd code/app && ./gradlew clean installDist -p .
	mkdir -p bin
	cp code/app/build/install/app/bin/* bin/

# Помощь
help:
	@echo "Доступные команды:"
	@echo "  make build    - собрать проект"
	@echo "  make run      - запустить приложение"
	@echo "  make test     - запустить тесты"
	@echo "  make clean    - очистить проект"
	@echo "  make check    - проверить стиль кода"
	@echo "  make deps     - показать зависимости"

