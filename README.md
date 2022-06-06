# Booking Film Ticket Online

## _A Web Application Project_
<hr>

## Motivation
Our goal for this project is to apply all the knowledge learned during the WAD course, and recreate a movie ticket booking web application.

## Features
<h3>Complete:</h3>

 - Main page: <img src="https://i.imgur.com/pClNdKn.png">

 - Sign in page: <img src="https://i.imgur.com/3HUc3Ul.png">

 - Sign up page: <img src="https://i.imgur.com/mrWWXs9.png">

 - Seat booking page: <img src="https://i.imgur.com/N5jwyW3.png">

 - Booking Result:<img src="https://i.imgur.com/ELMDN2p.png">

<h3>Not Complete:</h3>

 - Backend system (connect to database such as Sql)
 
## Code Structure
<h3>In src:</h3>

- components:
  - Contain common components used for the whole application: Button, Card, Model, Input,...
  - Usually those components does not contain the project's business logic. Eg: no side effect, cant connect to redux

- modules: can be a function or a page
  - Home: module-name
    - components: contain components only used in module, can contain project's business logic: side effect, redux
    - pages: contain components as one defined page
    - slices: contains redux slices (redux-toolkit)

- hooks: Contain custom hooks for project.

- services/apis:
  - Methods to call API (axios, fetch).
  - Contain methods related to API calling.

- utils: Contains js common functions used in the project:
  - array.js: contains functions to work with array
  - string.js: contains functions to work with string

- styles: contains css/scss files.

- App.js:
  - Router configuration:use lazyload
  - Global component: ErrorBoudary,...
- store.js: Setup redux store
- globalStyles.js: Setup global styles, use css-in-js

## Library
- Redux Toolkit
- UI :  TailwindCSS, Antd, Mantine
- Carousel : React Slick, react-resposive-carousel
- Form : React hook form, yup
- JS function tool : Lodash, moment (time)
- Notify : Toastify
- Others : react-glassmorphism, react-circular-progressbar...
- Store: @reduxjs/toolkit, react-redux
- Router: react-router-dom
- UI component: react-bootstrap/material-ui/ant-design/mantine,...
- Style:
  - SCSS: sass
  - CSS-in-JS: styled-component/@emotion

## Installation
Clone this repository locally. In a terminal, run the following command:

## Contributors

|                Links                          |       Name         |  Student ID | Contribution % |
|:---------------------------------------------:|:------------------:|:-----------:|:--------------:|
|<a href="https://github.com/vietducITITIU19103">Nguyễn Việt Đức</a> | ITITIU19103 |       34       |
|<a href="https://github.com/dinhvuduc">         Đinh Vũ Đức    </a> | ITITIU19104 |       33       |
|<a href="https://github.com/nhathuy19135/">     Nguyễn Nhật Huy</a> | ITITIU19135 |       33       |

## Flowchart Diagram
<img src="https://i.imgur.com/FDlobw0.png" alt="Flow chart diagram">


