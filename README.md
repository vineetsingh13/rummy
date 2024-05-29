# Rummy Game

Rummy is a popular card game. This Android application allows two players to play a simplified version of Rummy. The game includes features like dealing cards, showing the results, and animations for card dealing.

## Features

- **Deal Cards**: Players can deal cards by clicking the "Deal" button.
- **Showdown**: Once all cards are dealt, players can click the "Showdown" button to determine the winner.

## Screenshots
![rummy1](https://github.com/vineetsingh13/rummy/assets/80053859/cd6aa83c-e0d2-4684-9dee-53a7c9960605)
![rummy2](https://github.com/vineetsingh13/rummy/assets/80053859/220a4ed8-7b62-4907-884c-b86bd03b2f3a)
![rummy3](https://github.com/vineetsingh13/rummy/assets/80053859/3e5cc9e8-afb2-4103-bc21-992c671d9576)


## Installation

1. Clone the repository:

    ```sh
    git clone https://github.com/vineetsingh13/rummy.git
    ```
    
2. Open the project in Android Studio.
3. Build and run the project on an Android device or emulator.

## Usage

1. **Dealing Cards**:
    - Click the "Deal" button to deal a card to the player.
    - The AI will automatically deal a card after a short delay.

2. **Showdown**:
    - Once all cards are dealt to both players, the "Showdown" button will appear.
    - Click the "Showdown" button to see the result and determine the winner.

## Code Structure

- **MainActivity**: Handles the main game logic, including dealing cards and showing results.
- **GameOver Activity**: Displays the game result.
- **Models**:
    - `player`: Represents a player in the game.
    - `hand`: Represents a player's hand of cards.
    - `card`: Represents a single card.
    - `game`: Contains the game logic.


