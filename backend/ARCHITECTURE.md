# PolyglotMesh Backend Architecture

## Overview
The backend manages code execution requests and communicates with the GraalVM Polyglot Engine.

## Main Components

1. Spring Boot: Manages the backend application.
2. REST API: Receives code execution requests.
3. GraalVM: Executes supported programming languages.
4. Execution Service: Processes submitted code.
5. Response Handler: Returns output and errors.

## Execution Flow
User submits code -> REST API receives request -> GraalVM executes code -> Backend returns output.

## Future Enhancements
- Python and JavaScript execution.
- Secure context isolation.
- Execution time monitoring.
- Runtime error handling.
