# Copy this file to /build/native/nativeCompile/
FROM debian:bookworm-slim
COPY calculadora-aot-api /usr/bin/
ENTRYPOINT ["/bin/bash", "-c", "/usr/bin/calculadora-aot-api"]
