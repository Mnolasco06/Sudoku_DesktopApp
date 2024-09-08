# Sudoku Game Application

A Java-based Sudoku game built with JavaFX, designed to generate and solve Sudoku puzzles. This application uses a layered architecture to manage game logic, user interface, and data persistence.

## Table of Contents
- [Overview](#overview)
- [Project Structure](#project-structure)
- [Features](#features)
- [How to Run](#how-to-run)

## Overview

This project is a desktop Sudoku game application where users can play and solve Sudoku puzzles. The game ensures each puzzle is solvable and provides a graphical interface for users to interact with the puzzle grid.

## Project Structure

The project is divided into the following main components:
- **Build Logic:** Handles the initialization of the game state and user interface logic.
- **Computation Logic:** Manages the generation and solving of Sudoku puzzles.
- **Persistence Layer:** Handles saving and loading of game state from local storage.
- **User Interface:** Implements the graphical interface using JavaFX for user interactions.

## Features
- Randomly generated Sudoku puzzles
- Automatic puzzle validation and solving
- Persistent storage of game progress
- Graphical user interface (JavaFX)

## How to Run

1. Ensure you have **Java 11** or later installed.
2. Clone the repository:
   ```bash
   git clone <repository-url>
