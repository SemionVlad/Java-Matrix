# Matrix Image Processing System
## Black and White Image Manipulation
<!-- Tech & meta badges (static; no CI required) -->
![Language: Java](https://img.shields.io/badge/Language-Java-red?logo=java)
![Domain: Image Processing](https://img.shields.io/badge/Domain-Image%20Processing-0aa)
![Mode: Grayscale 0–255](https://img.shields.io/badge/Mode-Grayscale%200%E2%80%93255-4c1)
![Ops: Flip/Rotate](https://img.shields.io/badge/Ops-Flip%20%2F%20Rotate-795548)
![Matrix: int[][]](https://img.shields.io/badge/Matrix-int%5B%5D%5B%5D-999)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)
> Java matrix-based grayscale (0–255) image ops: vertical/horizontal flip and 90° rotations; deep copies, int[][] storage, O(n*m) per transform.


**Author:** Shimon Esterkin (207972258)  
**Version:** Maman14.2023b

## Overview
The Matrix class implements a two-dimensional image processing system for black and white images. Each pixel is represented by an integer value between 0 (white) and 255 (black), representing different shades of gray.

## Features

### 1. Image Representation
- 2D array of integers (0-255)
- White (0) to Black (255) range
- Grayscale value support
- Custom dimensions

### 2. Image Transformations
- Vertical flipping
- Horizontal flipping
- 90° clockwise rotation
- 90° counter-clockwise rotation

## Class Structure
```
Matrix.java
├── Constants
│   ├── WHITE (0)
│   └── BLACK (255)
├── Instance Variables
│   └── _mat (int[][])
├── Constructors
│   ├── Matrix(int[][])
│   └── Matrix(int, int)
└── Methods
    ├── Image Operations
    └── Utility Methods
```

## Usage Examples

### Creating a Matrix
```java
// Create from existing 2D array
int[][] data = {{255, 128, 0}, {0, 128, 255}};
Matrix image = new Matrix(data);

// Create empty matrix
Matrix emptyImage = new Matrix(3, 4); // 3 rows, 4 columns
```

### Image Transformations
```java
// Flip operations
Matrix verticalFlip = image.flipVertically();
Matrix horizontalFlip = image.flipHorizontally();

// Rotation operations
Matrix clockwise = image.rotateClockwise();
Matrix counterClockwise = image.rotateCounterClockwise();
```

## Technical Details

### Matrix Operations
1. **Vertical Flip**
   - Mirrors image left to right
   - Preserves dimensions
   - Each row is reversed

2. **Horizontal Flip**
   - Mirrors image top to bottom
   - Preserves dimensions
   - Rows are reversed

3. **Rotations**
   - 90-degree transformations
   - Dimensions are swapped
   - Preserves image content

### Memory Management
- Deep copying for constructors
- New matrix for each operation
- Efficient string building

## Implementation Notes

### Constructors
1. **Array-based Constructor**
   ```java
   Matrix(int[][] array)
   // Creates deep copy of input array
   ```

2. **Dimension-based Constructor**
   ```java
   Matrix(int rows, int cols)
   // Creates empty matrix with specified size
   ```

### Operation Results
- All operations return new Matrix objects
- Original matrix remains unchanged
- Automatic dimension handling

## Performance Considerations
- O(n*m) for all operations
- Efficient memory usage
- Optimized string building
- No recursive operations

## Usage Guidelines

### Best Practices
1. Image Creation
   - Ensure valid dimensions
   - Use appropriate constructor
   - Verify input data range

2. Transformations
   - Consider dimension changes
   - Chain operations carefully
   - Check results validity

### Common Operations
```java
// Complete image inversion
Matrix inverted = original.flipHorizontally().flipVertically();

// 180-degree rotation
Matrix rotated180 = original.rotateClockwise().rotateClockwise();
```

## Testing Recommendations
1. **Basic Operations**
   - Matrix creation
   - Simple transformations
   - Dimension verification

2. **Edge Cases**
   - Single row/column matrices
   - Square vs. rectangular matrices
   - Maximum values (255)

3. **Transformation Chains**
   - Multiple flips
   - Combined rotations
   - Mixed operations

## Known Limitations
1. Fixed value range (0-255)
2. No color support
3. No diagonal operations
4. No image file I/O

## Future Enhancements
- Color support
- Additional transformations
- Image file handling
- Compression support
- Filter operations

## Contributing
1. Fork the repository
2. Create your feature branch
3. Commit your changes
4. Create pull request

---
*Note: This implementation is part of an academic project demonstrating matrix operations and image processing concepts in Java.*
