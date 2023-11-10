## ScalableDependencies_and_RelayPlugin
### 1. Version Controls for managing the dependencies and plugins. 
- Firstly, switch to `project view` in android studio.
- In the `gradle`folder create a file named ` libs.versions.toml`

> NOTE: **TOML**, which stands for "Tom's Obvious Minimal Language 👉🏻 This is a Data serialization language designed for `configuration files`

<img src = "https://github.com/Brindha-m/ScalableDependencies_and_RelayPlugin/assets/72887609/6e0ed459-3475-405e-b78d-fc37332f76db" width = 600>
<br><br>

### Scenarios

| Example 1 | Example 2 |
| --- | --- |
| <img src="https://github.com/Brindha-m/ScalableDependencies_and_RelayPlugin/assets/72887609/b9815f61-96cb-4af4-9066-fc1c78dab673" width="850"> | <img src="https://github.com/Brindha-m/ScalableDependencies_and_RelayPlugin/assets/72887609/101c9477-368b-4ea2-b402-18366abdda7b" width="750"> |

- Rebuild the project
- Now let's see how to change our ` gradle(app top level) and gradle (module) level files `.

- `build.gradle.kts(module level) ` -->  **Before & After**

| Before | After |
| --- | --- |
| <img src="https://github.com/Brindha-m/ScalableDependencies_and_RelayPlugin/assets/72887609/21758065-63cf-45af-b55b-8a63a5a3c84b" width="750"> | <img src="https://github.com/Brindha-m/ScalableDependencies_and_RelayPlugin/assets/72887609/00746fbb-b592-4e24-b0b3-2be6b631744d" width="700"> |


- `build.gradle.kts(app level) ` -->  **Before & After**

| Before | After |
| --- | --- |
| <img src="https://github.com/Brindha-m/ScalableDependencies_and_RelayPlugin/assets/72887609/3cf51271-4370-44f2-aa39-a1122e0d10b5" width="800"> | <img src="https://github.com/Brindha-m/ScalableDependencies_and_RelayPlugin/assets/72887609/68a592b5-0689-4ddf-bcb0-6f21165da730" width="650"> |

- `setting.gradle.kts`
<img src = "https://github.com/Brindha-m/ScalableDependencies_and_RelayPlugin/assets/72887609/0e30ea0a-52d7-4a06-a769-73bcb4a7aa9c" width = "600">



### 2. Relay for Android composables. 

- You can create UI design in Figma and export to android as a jetpack composables using the ` Relay Plugin `.
- Install the relay plugin in both figma and andorid studio.
- Import the neccessary dependencies in andorid studio.
- Rebuild the project and ui-project (res) package will be automatically created.
- Some common controls
  - Create a Frame
  - `shift + A` -- Autolayout
  - Then select `Hug<->Hug`
  - Make another frame and make it a component anf set it `hug to hug`
  - Then add variants.. can also include images, buttons, text contents make sure it is auto aligned.

<br>

> Preview of the sample card
<img width="700" alt="image" src="https://github.com/Brindha-m/ScalableDependencies_and_RelayPlugin/assets/72887609/f26c9905-7e30-4f55-8078-e5b180bc3b4d">
   
> Now you can use that card as our composables.
<img src = "https://github.com/Brindha-m/ScalableDependencies_and_RelayPlugin/assets/72887609/6ed3078d-40a4-4b4b-af58-d71a3b3e63eb" width = "700">
<img src= "https://github.com/Brindha-m/ScalableDependencies_and_RelayPlugin/assets/72887609/c896d8ba-ee9b-46bf-8dc4-a5883a543b35" width = "200">

   
