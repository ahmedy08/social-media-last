<template>
  <div>
    <router-view to="/"></router-view>
  </div>
</template>

<script>
import { defineComponent } from 'vue'

export default defineComponent({
  name: 'App',
    setup() {
    return {}
  },
})
</script>
