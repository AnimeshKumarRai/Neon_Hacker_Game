# Neon Hacker - Number Guessing Game

A cyberpunk-themed number guessing game where players try to decrypt a randomly generated number. After each guess, the game provides feedback whether the player's guess was too high or too low, helping them narrow down to the correct answer.

[Neon Hacker Game](https://animeshkumarrai.github.io/Neon_Hacker_Game/)

## 🎮 Game Features

- **Cyberpunk Aesthetic**: Neon glow effects, matrix rain background, and retro terminal interface
- **Three Difficulty Levels**:
  - Easy: Numbers 1-50 with 15 attempts
  - Medium: Numbers 1-100 with 10 attempts
  - Hard: Numbers 1-200 with 5 attempts
- **Exit Option**: Players can enter -1 or click the Exit button to quit the game at any time
- **Scoring System**: Points based on remaining attempts and difficulty level
- **Statistics Tracking**: Games played, games won, high score, and win rate
- **Visual Effects**: Particle effects, animations, and sound feedback
- **Responsive Design**: Works on both desktop and mobile devices

## 🚀 How to Play

1. Open the game in your web browser
2. Select a difficulty level (Easy, Medium, or Hard)
3. Enter your guess in the input field
4. After each guess, the game will tell you if your guess was too high or too low
5. Continue guessing until you find the correct number or run out of attempts
6. To exit the game at any time, enter -1 or click the Exit button
7. Try to achieve the highest score possible!

## 🛠️ Technologies Used

- **HTML5**: For the game structure
- **CSS3**: For styling and animations (including Tailwind CSS)
- **JavaScript (ES6)**: For game logic and interactivity
- **GSAP**: For advanced animations and particle effects
- **Web Audio API**: For sound effects

## 📱 Installation

To run this game locally, follow these steps:

1. Clone the repository:
   ```bash
   git clone https://github.com/AnimeshKumarRai/Neon_Hacker_Game.git
   ```

2. Navigate to the project directory:
   ```bash
   cd Neon_Hacker_Game
   ```


Alternatively, you can use a local development server like Live Server in VS Code or any other HTTP server.

## 🎯 Game Mechanics

### Scoring System

- Easy difficulty: 10 points per remaining attempt
- Medium difficulty: 20 points per remaining attempt
- Hard difficulty: 30 points per remaining attempt

### Exit Functionality

Players can exit the game at any time by:
- Entering "-1" in the input field
- Clicking the "EXIT GAME" button

When exiting, the game will display a termination message and disable the input field until a new difficulty is selected.

## 🎨 Customization

To customize the game:

1. **Colors**: Modify the CSS variables in the `:root` selector:
   ```css
   :root {
       --neon-pink: #ff2a6d;
       --neon-blue: #05d9e8;
       --neon-purple: #d300c5;
       --dark-bg: #0d0221;
   }
   ```

2. **Difficulty Settings**: Adjust the parameters in the `initGame()` function:
   ```javascript
   // Set target number based on difficulty
   const maxNumber = difficulty === 'easy' ? 50 : difficulty === 'hard' ? 200 : 100;
   
   // Set attempts based on difficulty
   attemptsLeft = difficulty === 'easy' ? 15 : difficulty === 'hard' ? 5 : 10;
   ```

3. **Scoring**: Modify the scoring calculation in the `checkGuess()` function:
   ```javascript
   score += attemptsLeft * (difficulty === 'easy' ? 10 : difficulty === 'hard' ? 30 : 20);
   ```

## 🤝 Contributing

Contributions are welcome! If you'd like to contribute to this project, please follow these steps:

1. Fork the repository
2. Create a new branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## 📝 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 👏 Acknowledgments

- [Tailwind CSS](https://tailwindcss.com/) for the utility-first CSS framework
- [GSAP](https://greensock.com/gsap/) for the animation library
- [Google Fonts](https://fonts.google.com/) for the Orbitron and Press Start 2P fonts
- [Mixkit](https://mixkit.co/) for the sound effects


---

Enjoy the game! 🎮✨
