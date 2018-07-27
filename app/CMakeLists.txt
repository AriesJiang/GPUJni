# Sets the minimum version of CMake required to build your native library.
# This ensures that a certain set of CMake features is available to
# your build.

cmake_minimum_required(VERSION 3.4.1)

# Specifies a library name, specifies whether the library is STATIC or
# SHARED, and provides relative paths to the source code. You can
# define multiple libraries by adding multiple add.library() commands,
# and CMake builds them for you. When you build your app, Gradle
# automatically packages shared libraries with your APK.

#设置生成的so动态库最后输出的路径
set(CMAKE_LIBRARY_OUTPUT_DIRECTORY ${PROJECT_SOURCE_DIR}/../jniLibs/${ANDROID_ABI})

add_library( # Specifies the name of the library.
             gpuimage-lib

             # Sets the library as a shared library.
             SHARED

             # Provides a relative path to your source file(s).
             src/main/cpp/yuv-decoder.c )

find_library( # Defines the name of the path variable that stores the
           # location of the NDK library.
           log-lib

           # Specifies the name of the NDK library that
           # CMake needs to locate.
           log )

# Links your native library against one or more other native libraries.
target_link_libraries( # Specifies the target library.
                     gpuimage-lib

                      # Links the log library to the target library.
                    ${log-lib} )