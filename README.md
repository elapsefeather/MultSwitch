# MultSwitch

[![](https://jitpack.io/v/elapsefeather/MultSwitch.svg)](https://jitpack.io/#elapsefeather/MultSwitch)
自定義滑動樣式選單 SwtichBtn

## sample

<img src="https://github.com/elapsefeather/MultSwitch/blob/c37dddd442e8634a12682bc03b5fb854f7e9561c/screenshots/multSwitch.gif" height="500">

## Setup

The easiest way to add the **MultSwitch** library to your project is by adding it as a dependency to
your build.gradle

**Step 1.** Add the JitPack repository to your build file

```gradle
allprojects {
    repositories {
        maven { url 'https://jitpack.io' }
    }
}
```

**Step 2.** Add the dependency

```gradle
dependencies {
    implementation 'com.github.elapsefeather:MultSwitch:1.0.0'
}
```

## parameter

| parameter             | parameter type    | effect            |
| -------------         |-------------      |-------------      |
| strokeRadius          | dimension         | 選項圓角          |
| strokeWidth           | dimension         | 選項寬度          |
| indicatorWidth        | dimension         | 指示器寬度        |
| indicatorHeight       | dimension         | 指示器高度        |
| textSize              | dimension         | 選項字體大小      |
| typeface              |string             | 字體字型          |
| selectedColor         | color\|reference  | 選中色            |
| selectedTextColor     | color\|reference  | 選中字體色        |
| unselectedColor       | color\|reference  | 未選中色          |
| unselectedTextColor   | color\|reference  | 未選中字體色      |
| switchTabs            | reference[array]  | 選項列表          |
| selectedTab           | integer           | 預設選項          |
| blockStyle            | blockStyle        | 可選樣式： <br> original <br> brim <br> rounded <br> bottomLine <br> bottomShortLine     |
| mutiLine              | boolean           | 選項是否自動換行  |

## Usage

```
    <com.elapsefeather.lib.MultSwitch
        android:id="@+id/multSwitch4"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_margin="5dp"
        android:padding="8dp"
        app:blockStyle="rounded"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@id/multSwitch3"
        app:selectedColor="#ED99B6"
        app:selectedTextColor="#fff"
        app:strokeRadius="20dp"
        app:strokeWidth="1dp"
        app:switchTabs="@array/tab1"
        app:textSize="18dp"
        app:unselectedTextColor="#E91E63" />
```

## Version History

> ### v1.0.0(2022/10/01)
> - new project.
