Mojang Authlib All Versions (V1)
=========

Maven pom.xml

https://github.com/HappyRogelio7/MojangAuthlibAllVersions1/blob/master/pom.xml

Here you can find the imported libraries in Maven Format

```xml
<repositories>
        <repository>
            <id>spigotmc-repo</id>
            <url>https://hub.spigotmc.org/nexus/content/repositories/snapshots/</url>
        </repository>
        <repository>
            <id>sonatype</id>
            <url>https://oss.sonatype.org/content/groups/public/</url>
        </repository>
        <repository>
            <id>minecraft-repo</id>
            <url>https://libraries.minecraft.net/</url>
        </repository>
        <!-- Important Note:>
            Here you can find the list of versions of the Mojang AuthLib,
            in a web interface, something that does not allow you to see the mojang libraries page.
            http://nathaantfm.alwaysdata.net/explorer/?package=com.mojang&name=authlib
        <Important Note:-->
    </repositories>

    <dependencies>
        <dependency>
            <groupId>org.spigotmc</groupId>
            <artifactId>spigot-api</artifactId>
            <version>1.18.2-R0.1-SNAPSHOT</version>
            <scope>provided</scope>
        </dependency>
        <!-- Important Note:>
            Here is the Mojang AuthLib from 1.19.pre3 to 1.8.9-1.7.10 (version 1.5.21, there is also version 1.7.10)
        <Important Note-->

        <!--Important Note: This is from 1.19.pre3 for some reason maven doesn't import it from the
            link download it from the link and import it manually:
            https://libraries.minecraft.net/com/mojang/authlib/3.5.41/authlib-3.5.41.jar
        -->
        <!--dependency>
            <groupId>com.mojang</groupId>
            <artifactId>authlib</artifactId>
            <version>3.5.41</version>
            <scope>provided</scope>
        </dependency-->
        <dependency>
            <groupId>com.mojang</groupId>
            <artifactId>authlib</artifactId>
            <version>3.3.39</version>
            <scope>provided</scope>
        </dependency>
        <dependency>
            <groupId>com.mojang</groupId>
            <artifactId>authlib</artifactId>
            <version>1.5.21</version>
            <scope>provided</scope>
        </dependency>
        <!--
        All these libraries that come next are not imported by maven if you want to use them you have
        to download and import them manually.
        Here are the versions for you to download:
        http://nathaantfm.alwaysdata.net/explorer/?package=com.mojang&name=authlib
        -->
        <!--dependency>
            <groupId>com.mojang</groupId>
            <artifactId>authlib</artifactId>
            <version>3.2.38</version>
            <scope>provided</scope>
        </dependency>
        <dependency>
            <groupId>com.mojang</groupId>
            <artifactId>authlib</artifactId>
            <version>3.2.37</version>
            <scope>provided</scope>
        </dependency>
        <dependency>
            <groupId>com.mojang</groupId>
            <artifactId>authlib</artifactId>
            <version>3.1.36</version>
            <scope>provided</scope>
        </dependency>
        <dependency>
            <groupId>com.mojang</groupId>
            <artifactId>authlib</artifactId>
            <version>3.0.35</version>
            <scope>provided</scope>
        </dependency>
        <dependency>
            <groupId>com.mojang</groupId>
            <artifactId>authlib</artifactId>
            <version>2.3.31</version>
            <scope>provided</scope>
        </dependency>
        <dependency>
            <groupId>com.mojang</groupId>
            <artifactId>authlib</artifactId>
            <version>2.2.30</version>
            <scope>provided</scope>
        </dependency>
        <dependency>
            <groupId>com.mojang</groupId>
            <artifactId>authlib</artifactId>
            <version>2.1.29</version>
            <scope>provided</scope>
        </dependency>
        <dependency>
            <groupId>com.mojang</groupId>
            <artifactId>authlib</artifactId>
            <version>2.0.28</version>
            <scope>provided</scope>
        </dependency>
        <dependency>
            <groupId>com.mojang</groupId>
            <artifactId>authlib</artifactId>
            <version>2.0.27</version>
            <scope>provided</scope>
        </dependency>
        <dependency>
            <groupId>com.mojang</groupId>
            <artifactId>authlib</artifactId>
            <version>2.0.26</version>
            <scope>provided</scope>
        </dependency>
        <dependency>
            <groupId>com.mojang</groupId>
            <artifactId>authlib</artifactId>
            <version>1.6.25</version>
            <scope>provided</scope>
        </dependency>
        <dependency>
            <groupId>com.mojang</groupId>
            <artifactId>authlib</artifactId>
            <version>1.5.25</version>
            <scope>provided</scope>
        </dependency>
        <dependency>
            <groupId>com.mojang</groupId>
            <artifactId>authlib</artifactId>
            <version>1.5.26</version>
            <scope>provided</scope>
        </dependency>
        <dependency>
            <groupId>com.mojang</groupId>
            <artifactId>authlib</artifactId>
            <version>1.5.24</version>
            <scope>provided</scope>
        </dependency>
        <dependency>
            <groupId>com.mojang</groupId>
            <artifactId>authlib</artifactId>
            <version>1.5.22</version>
            <scope>provided</scope>
        </dependency-->
        <!-- Important Note:>
            There are more versions below but those versions are no longer used.
        <Important Note-->
    </dependencies>
```

In a future update it will be like importing the Mojang AuthLib in Gradle


---

## Join us

* Feel free to open a PR! We accept contributions.
* [Discord](https://discord.gg/3EebYUyeUX)

## Special Thanks To

![IntelliJ IDEA logo](https://resources.jetbrains.com/storage/products/company/brand/logos/IntelliJ_IDEA_icon.png?size=100px)
![IntelliJ IDEA logo](https://resources.jetbrains.com/storage/products/company/brand/logos/IntelliJ_IDEA.png)
![Azul Java logo](https://www.azul.com/wp-content/themes/azul/dist/img/logo.svg)

[nathaantfm.alwaysdata.net](http://nathaantfm.alwaysdata.net/explorer/?package=com.mojang&name=authlib)List where the available versions of the AuthLib are found, on a graphical website.

[IntelliJ IDEA](https://www.jetbrains.com/idea/), Code editor for Java and other programming languages and programs.

[Azul Java](https://www.azul.com/) The world’s largest commercial provider of OpenJDK
