<template>
  <button><span></span>{{text}}</button>
</template>

<script>
export default {
  name: "NewButtonComponent",
  props: ['text']
}
</script>

<style scoped>

button {
  width: 150px;
  height: 60px;
  text-align: center;
  border-radius: 25px;
  margin-right: 5px;
  font-weight: bold;
  border: 2px solid #009688;
  background: transparent;
  color: #fff;
  cursor: pointer;
  position: relative;
  overflow: hidden;
}

span {
  background: #009688;
  height: 100%;
  width: 0;
  border-radius: 25px;
  position: absolute;
  left: 0;
  bottom: 0;
  z-index: -1;
  transition: 0.5s;
}

button:hover span {
  width: 100%;
}

button:hover {
  border: none;
}

</style>
